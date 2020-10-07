
void setup() {
 
  // set the size of your sketch
  size(400,400);

int h=200;
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int b=0;b<8;b++){
   if(b % 2==0){
     fill(3,185,255); 
   }
   else{
     fill(3,118,255);
   }
    ellipse(200,200,h,h);
    h-=20;
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
