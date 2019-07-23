int a = (int)random(0,600);
int y = 10;
void setup() {
size(600, 600);
}
void draw() {
y = y+4;
background(#AAF9FF);
fill(#1844C4);
stroke(#050505);
ellipse(a, y, 8, 15);
if (y >= 600) {
a = (int)random(0,600);
y = 10;
}
}
