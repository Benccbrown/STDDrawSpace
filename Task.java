import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24234681
 */
public class Task {
    
        //imports all the images so I can make them work when I apply them to shapes
        public static final String EARTH = "./src/earth.jpg";
        public static final String SUN = "./src/sun.jpg";
        public static final String JUPITER = "./src/jupiter.jpg";
        public static final String MARS = "./src/mars.jpg";
        public static final String MERCURY = "./src/mercury.jpg";
        public static final String MOON = "./src/moon.jpg";
        public static final String NEPTUNE = "./src/neptune.jpg";
        public static final String STARS = "./src/stars.jpg";
        public static final String URANUS = "./src/uranus.jpg";
        public static final String VENUS = "./src/venus.jpg";
        public static final String SATURN = "./src/saturn.jpg";
        public static final String SATURNRING = "./src/saturnRing.png";
        
        
       	public static void main(String[] args)
	{
                StdDraw3D.setCanvasSize(1000, 1000);
		StdDraw3D.setScale(-13, 13);
                
                
                double edegree = 0; //earths degree equals 0
                double moondegree = 0; //moons degree equals 0
                double positionex;
                double positioney;   
                double e1y = 5;
                double e1x = 10;
                double jdegree = 0; //jupiters degree equals 0
                double j1y = 10;
                double j1x = 15;
                double mars1y = 6;
                double mars1x = 11;
                double marsdegree = 0; //mars's degree equals 0
                double mercury1y = 3;
                double mercury1x = 3;
                double mercurydegree = 0; //murcurys degree equals 0
                double n1y = 18;
                double n1x = 23;
                double ndegree = 0; //neptunes degree equals 0
                double s1y = 13;
                double s1x = 18;
                double sdegree = 0; //saturns degree equals 0
                double u1y = 16;
                double u1x = 20;
                double udegree = 0; //uranus's degree equals 0
                double v1y = 4;
                double v1x = 8;
                double vdegree = 0; //venus's degree equals 0
                
                
                //planets
                //creates the earth
                StdDraw3D.Shape earth = StdDraw3D.sphere(0, 0, 0, 0.3, EARTH);
                
                //creates the moon
                StdDraw3D.Shape moon = StdDraw3D.sphere(0, 0, 0, 0.1, MOON);
                
                //creates jupiter
                StdDraw3D.Shape jupiter = StdDraw3D.sphere(0, 0, 0, 1, JUPITER);

                 //creates mars
                StdDraw3D.Shape mars = StdDraw3D.sphere(0, 0, 0, 0.15, MARS);
                
                 //creates mercury
                StdDraw3D.Shape mercury = StdDraw3D.sphere(0, 0, 0, 0.12, MERCURY);
                
                 //creates neptune
                StdDraw3D.Shape neptune = StdDraw3D.sphere(0, 0, 0, 0.6, NEPTUNE);
                
                 //creates saturn
                StdDraw3D.Shape saturn = StdDraw3D.sphere(0, 0, 0, 0.8, SATURN);
                
                //creates saturns ring
                StdDraw3D.Shape saturnRing = StdDraw3D.ellipsoid(10, 5, 0, 1.2, 0, 1.2, SATURNRING);
                
                 //creates uranus
                StdDraw3D.Shape uranus = StdDraw3D.sphere(0, 0, 0, 0.6, URANUS);
                
                 //creates venus
                StdDraw3D.Shape venus = StdDraw3D.sphere(0, 0, 0, 0.3, VENUS);
                
                 //Creates the background of stars
                StdDraw3D.sphere(0, 0, 0, 50, STARS);
                        
                //draws the sun
                StdDraw3D.sphere(0, 0, 0, 2, SUN);

                //Creates a light where the sun is
                StdDraw3D.pointLight(0, 0, 0, Color.WHITE);
                
		while (true)
		{
			
                        //earth code
                        //makes the earth move around at an angle which is equal to earths degree
                        double eangle = Math.toRadians(edegree);
                        
                        //Creates the angle that the earth is away from the sun
                        double ey = (e1y * Math.cos(eangle));
                        double ex = (e1x * Math.sin(eangle));
                        
                        positionex = ex; //saves the xi point in an array
                        positioney = ey; //saves the yi point in an array
                        
                        //draws the earth
                       // StdDraw3D.sphere(ex, ey, 0, 0.3, 0, edegree, edegree, EARTH);
                       
                        earth.setPosition(ex, ey, 0);
                        earth.rotate(0, edegree, edegree);
                        
                        
                        
                        //moon code:
                        //distance from the earth
                        double moonc = 1;
                        
                        //makes the moon move around at an angle which is equal to its degree
                        double moonangle = Math.toRadians(moondegree);
                        
                        //Creates the angle that the moon is away from the earth
                        double moony = (moonc * Math.cos(moonangle) + positioney);
                        double moonx = (moonc * Math.sin(moonangle) + positionex);

                        
                        moon.setPosition(moonx, moony, 0);
                        moon.rotate(0, moonangle, moonangle);

                        
                        
                        
                        
                        //jupiter code
                        //makes jupiter move around at an angle which is equal to its degree
                        double jangle = Math.toRadians(jdegree);
                        
                        //Creates the angle that the jupiterh is away from the sun
                        double jy = (j1y * Math.cos(jangle));
                        double jx = (j1x * Math.sin(jangle));
                        
                        //draws jupiter
                        jupiter.setPosition(jx, jy, 0);
                        jupiter.rotate(0, jangle, jangle);
                        
                        
                        
                        
                        
                        //mars code
                        //makes mars move around at an angle which is equal to its degree
                        double marsangle = Math.toRadians(marsdegree);
                        
                        //Creates the angle that mars is away from the sun
                        double marsy = (mars1y * Math.cos(marsangle));
                        double marsx = (mars1x * Math.sin(marsangle));
                        
                        //draws mars
                        mars.setPosition(marsx, marsy, 0);
                        mars.rotate(0, marsangle, marsangle);
                        
                        
                        
                        
                        //mercury code
                        //makes mercury move around at an angle which is equal to its degree
                        double mercuryangle = Math.toRadians(mercurydegree);
                        
                        //Creates the angle that mercury is away from the sun
                        double mercuryy = (mercury1y * Math.cos(mercuryangle));
                        double mercuryx = (mercury1x * Math.sin(mercuryangle));
                        
                        //draws mercury
                        mercury.setPosition(mercuryx, mercuryy, 0);
                        mercury.rotate(0, mercuryangle, mercuryangle);
                        
                        
                        
                        
                        
                        //neptune code
                        //makes neptune move around at an angle which is equal to its degree
                        double nangle = Math.toRadians(ndegree);
                        
                        //Creates the angle that neptune is away from the sun
                        double ny = (n1y * Math.cos(nangle));
                        double nx = (n1x * Math.sin(nangle));
                        
                        //draws neptune
                        neptune.setPosition(nx, ny, 0);
                        neptune.rotate(0, nangle, nangle);
                        
                        
                        //saturn code
                        //makes saturn move around at an angle which is equal to its degree
                        double sangle = Math.toRadians(sdegree);
                        
                        //Creates the angle that saturn is away from the sun
                        double sy = (s1y * Math.cos(sangle));
                        double sx = (s1x * Math.sin(sangle));
                        
                        //draws saturn
                        saturn.setPosition(sx, sy, 0);
                        saturn.rotate(0, sangle, sangle);
                        
                        //draws saturns ring
                        saturnRing.setPosition(sx, sy, 0);
                        saturnRing.rotate(0, sangle, sangle);
                        
                        
                        
                        
                        //uranus code
                        //makes uranus move around at an angle which is equal to its degree
                        double uangle = Math.toRadians(udegree);
                        
                        //Creates the angle that uranus is away from the sun
                        double uy = (u1y * Math.cos(uangle));
                        double ux = (u1x * Math.sin(uangle));
                        
                        //draws uranus
                        uranus.setPosition(ux, uy, 0);
                        uranus.rotate(0, uangle, uangle);
                        
                        
                        
                        
                        //venus code
                        //makes venus move around at an angle which is equal to its degree
                        double vangle = Math.toRadians(vdegree);
                        
                        //Creates the angle that venus is away from the sun
                        double vy = (v1y * Math.cos(vangle));
                        double vx = (v1x * Math.sin(vangle));
                        
                        //draws uranus
                        venus.setPosition(vx, vy, 0);
                        venus.rotate(0, vangle, vangle);
                        
                        
                        
                        //each frame planets and moons degree will increase
                        edegree++;
                        moondegree = moondegree + 13;
                        jdegree = jdegree + 0.08;
                        marsdegree = marsdegree + 0.53;
                        mercurydegree = mercurydegree + 4.1;
                        ndegree = ndegree + 0.006;
                        sdegree = sdegree + 0.03;
                        udegree = udegree + 0.01;
                        vdegree = vdegree + 1.6;
                        
                        //shows the script running for 20 seconds
			StdDraw3D.show(50);
		}
	} 
}
