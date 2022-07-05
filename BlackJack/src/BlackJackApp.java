import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class BlackJackApp extends Application {
	BlackJack game;
	StackPane root;
	ImageView [] playerCards;
	ImageView [] dealerCards;
	AudioClip cardFlip, clapping;
	ImageView hole;
	ImageView hit, stay, quit;
	Image hitUp, hitDown, stayUp, stayDown;
	int round, playerWins, dealerWins;
	Text dealerWinsText, playerWinsText, playerScoreText, dealerScoreText;
	boolean playerTurn;
	
	@Override
	public void start(Stage primaryStage) {
		game = new BlackJack();
		playerCards = new ImageView [5];
		dealerCards = new ImageView [5];
		dealerWinsText = new Text(0, 0, "");
		dealerWinsText.setFill(Color.WHITE);
		dealerWinsText.setFont(Font.font("Verdana", 20));
		dealerWinsText.setTranslateX(250);
		dealerWinsText.setTranslateY(225);
		playerWinsText = new Text(0, 0, "");
		playerWinsText.setFill(Color.WHITE);
		playerWinsText.setFont(Font.font("Verdana", 20));
		playerWinsText.setTranslateX(250);
		playerWinsText.setTranslateY(190);
		playerScoreText = new Text(0, 0, "");
		playerScoreText.setFill(Color.WHITE);
		playerScoreText.setFont(Font.font("Verdana", 20));
		playerScoreText.setTranslateX(-250);
		playerScoreText.setTranslateY(-190);
		cardFlip = new AudioClip("file:classic-cards/cardPlace1.wav");
		clapping = new AudioClip("file:classic-cards/wellDone.wav");
		//initialize buttons
		hole = new ImageView();
		hole.setTranslateX(100);
		hole.setTranslateY(-100);
		hole.setImage(new Image("file:classic-cards/b2fv.png"));
		hit = new ImageView();
		hitUp = new Image("file:classic-cards/hit.png");
		hitDown = new Image("file:classic-cards/hit-down.png");
		hit.setImage(hitUp);
		hit.setTranslateX(-200);
		hit.setTranslateY(200);
		hit.setOnMousePressed(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				hit.setImage(hitDown);
			}
		});
		hit.setOnMouseReleased(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				hit.setImage(hitUp);
				//if(playerTurn)
					//playerHit();
			}
		});
		stay = new ImageView();
		stayUp = new Image("file:classic-cards/stay.png");
		stayDown = new Image("file:classic-cards/stay-down.png");
		stay.setOnMousePressed(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				stay.setImage(stayDown);
			}
		});
		stay.setOnMouseReleased(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				stay.setImage(stayUp);
				//if(playerTurn)
					//playerStay();
			}
		});
		stay.setImage(stayUp);
		stay.setTranslateX(-20);
		stay.setTranslateY(200);
	}
	
	private void dealerTurn() {
		Card c = game.getDealer().playTurn(game.getDeck());
		if(c != null) {
			dealerCards[round + 1] = new ImageView();
			dealerCards[round + 1].setImage(c.getImage());
			dealerCards[round + 1].setTranslateX(200 - (round + 1)*100);
			dealerCards[round + 1].setTranslateY(-100);
			//root.getChildren().add(dealerCards[round + 1]);
			//cardFlip.play();
		}

	}
	private void playerTurn() {
		playerTurn = true;
	}
}
