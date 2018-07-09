void setup(){
  size(700,500);
  PImage dog = loadImage("dog.jpg");
  dog.resize(width,height);
  image(dog,0,0);
}
void draw(){
  fill(#53818E);
  ellipse(292,135,40,40);
  ellipse(436,122,30,30);
  fill(#050303);
  fill(mouseX,mouseY,100);
  ellipse(436,122,10,10);
  ellipse(292,135,10,10);
  fill(mouseX,mouseY,100);
  if(mousePressed)
  {println(mouseX+" "+mouseY);
  
}}