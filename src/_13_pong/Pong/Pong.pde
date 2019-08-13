PImage backgroundImage;
int ballx = 300;
int ballY = 300;
int ballXvelocity = 8;
int ballYvelocity = -5;
int score = 0;
void setup() {
  size(600, 600);
  backgroundImage = loadImage("pong.png");
}
void draw() {
  backgroundImage = loadImage("pong.png");
  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, 600, 600);
  fill (#FF0303);
  stroke(#000000);
  ellipse(ballx, ballY, 30, 30);
  fill(#03FF2A);
  rect(mouseX, 585, 70, 15);
  textSize(32);
  text(""+score, 300, 300);
  ballx = ballx + ballXvelocity;
  ballY = ballY + ballYvelocity;
  if (ballx >= 600) {
    ballXvelocity = -8;
  } else if (ballx <= 0) {
    ballXvelocity = 8;
  }
  if (ballY<=0) {
    ballYvelocity = 8;
  }
if (ballY >= 582 && ballx >= mouseX && ballx <= mouseX + 70) {
ballYvelocity = -5;
score = score+1;
if (ballY > 600){
 ballx = 300;
 ballY = 300;
score = 0;
text(""+score, 300, 300);
}
}
}
