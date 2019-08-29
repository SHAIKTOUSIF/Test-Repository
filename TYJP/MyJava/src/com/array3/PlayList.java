package com.array3;

public class PlayList {
	public static void listening(Songs[] pl)
	{
		
		for(int i=0;i<pl.length; i++)
		{
			System.out.println(pl[i].title);
			System.out.println(pl[i].duration);
			System.out.println(pl[i].singer);
			System.out.println("_________________");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Songs[] playL=new Songs[7];
		playL[0]=new Songs("Teri Meri",4.0,"Rahet fateh ali khan");
		playL[1]=new Songs("Tagru",3.8,"Antony dassan");
		playL[2]=new Songs("Nanaku Premaku",3.0,"Dsp");
		playL[3]=new Songs("Malhari",4.5,"Yesedass");
		playL[4]=new Songs("Vande Matra",5.0,"A.R rahman");
		playL[5]=new Songs("Ankhaya Ka kajal",4.5,">>>>");
		playL[6]=new Songs("Senorita",5.0,"Shawn Mades");
		
		listening(playL);

	}

}
