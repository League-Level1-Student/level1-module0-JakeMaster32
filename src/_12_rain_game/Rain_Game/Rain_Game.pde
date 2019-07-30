int a = (int)random(0, 600);
int y = 10;
int score = 0;
void setup() {
  size(600, 600);
}
void draw() {
  y = y+4;
  background(#AAF9FF);
  fill(#717070);
  rect(mouseX, 540, 50, 60);
  fill(#1844C4);
  stroke(#050505);
  ellipse(a, y, 8, 15);
  if ( y >= 540 && a > mouseX && a < mouseX+50) {
    checkCatch(a); 
    a = (int)random(0, 600);
    y = 10;
  } else if (y >= 600) {
    checkCatch(a);
    a = (int)random(0, 600);
    y = 10;
  }
}
void checkCatch(int a) {
  if (a > mouseX && a < mouseX+50)
    score++;
  else if (score > 0) 
    score--;
  println("Your score is now: " + score);
}
