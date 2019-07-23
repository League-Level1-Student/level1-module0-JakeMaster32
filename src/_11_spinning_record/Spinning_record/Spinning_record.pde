import ddf.minim.*;
PImage pictureOfRecord;
Minim minim;
AudioPlayer song;
int angle = 0;
//setup();
void setup() {
  size(600, 600);
  pictureOfRecord= loadImage("record.png");
  pictureOfRecord.resize(height, width);
  minim = new Minim(this);
  song = minim.loadFile("NINTENDO Mii THEME (Trap Remix) - VANDER.mp3", 512);
}
//draw();
void draw() {
  image(pictureOfRecord, 0, 0);
  if (mousePressed) {
    System.out.println("Test");
    rotateImage(pictureOfRecord, angle);
    image(pictureOfRecord, 0, 0);
    angle = angle +1;
    song.play();
  }
  else {song.pause();}
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
