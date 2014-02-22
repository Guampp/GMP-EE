#!/bin/bash 
#mogrify
#mkdir 128;
#mkdir 64;
mkdir 48;
mkdir 32;
mkdir 24;
mkdir 16;

#for i in *.png; 
#do 
# 	convert -resize 128x128 $i 128/$i; 
#done

#for i in *.png; 
#do 
#  	convert -resize 64x64 $i 64/$i; 
#done

for i in *.png; 
do 
  	convert -resize 48x48 $i 48/$i; 
done

for i in *.png; 
do 
  	convert -resize 32x32 $i 32/$i; 
done

for i in *.png; 
do 
  	convert -resize 24x24 $i 24/$i; 
done

for i in *.png; 
do 
  	convert -resize 16x16 $i 16/$i; 
done
