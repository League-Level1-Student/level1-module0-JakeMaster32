int ballx = 300;
int ballvelocity = 5;
void setup() {
size(600, 600);
background(#FFFFFF);
}
void draw() {
  background(#FFFFFF);
fill (#FF0303);
stroke(#000000);
ellipse(ballx, 300, 30, 30);
ballx = ballx + ballvelocity;
if (ballx >= width) {
ballvelocity = -5;
}
else if (ballx <= 0) {
ballvelocity = 5;
}
}
