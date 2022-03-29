package chess; 	

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
* <h1> Chess Game </h1>
* The chess program simulates a chess match between two people.
* It takes a move as an input and then prints the chess board
* with the implemented move.
* 
*
* @author  Varun Gaddam
*/
public class Chess {
	
	/**
	* Represents whether the white king has been moved
	*/
	public static boolean whiteKingMoved=false;
	
	/**
	* Represents whether the black king has been moved
	*/
	public static boolean blackKingMoved=false; 
	
	/**
	* Represents whether the white right rook has been moved
	*/
	public static boolean whiteRook1Moved=false;
	
	/**
	* Represents whether the white left rook has been moved
	*/
	public static boolean whiteRook2Moved=false; 
	
	/**
	* Represents whether the black right rook has been moved
	*/
	public static boolean blackRook1Moved=false;  
	
	/**
	* Represents whether the black left rook has been moved
	*/
	public static boolean blackRook2Moved=false;
	
	/**
	* represents the visual chess board
	*/
	public static String[][] board=new String[9][9];
	
	/**
	* A list of the possible rows for the board 
	*/
	public static ArrayList<String> letters=new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h"));
	
	/**
	* Represents whether the black A7 pawn has been moved
	*/
	public static boolean black0=false;
	
	/**
	* Represents whether the black B7 pawn has been moved
	*/
	public static boolean black1=false;
	
	/**
	* Represents whether the black C7 pawn has been moved
	*/
	public static boolean black2=false;
	
	/**
	* Represents whether the black D7 pawn has been moved
	*/
	public static boolean black3=false;
	
	/**
	* Represents whether the black E7 pawn has been moved
	*/
	public static boolean black4=false;
	
	/**
	* Represents whether the black F7 pawn has been moved
	*/
	public static boolean black5=false;
	
	/**
	* Represents whether the black G7 pawn has been moved
	*/
	public static boolean black6=false;
	
	/**
	* Represents whether the black H7 pawn has been moved
	*/
	public static boolean black7=false;
	
	
	/**
	* Represents the number of times black A7 pawn has been moved
	*/
	public static int blackPawn0=0;
	
	/**
	* Represents the number of times black B7 pawn has been moved
	*/
	public static int blackPawn1=0;
	
	/**
	* Represents the number of times black C7 pawn has been moved
	*/
	public static int blackPawn2=0;
	
	/**
	* Represents the number of times black D7 pawn has been moved
	*/
	public static int blackPawn3=0;
	
	/**
	* Represents the number of times black E7 pawn has been moved
	*/
	public static int blackPawn4=0;
	
	/**
	* Represents the number of times black F7 pawn has been moved
	*/
	public static int blackPawn5=0;
	
	/**
	* Represents the number of times black G7 pawn has been moved
	*/
	public static int blackPawn6=0;
	
	/**
	* Represents the number of times black H7 pawn has been moved
	*/
	public static int blackPawn7=0;
	
	/**
	* Represents the number of times white A2 pawn has been moved
	*/
	public static int whitePawn0=0;
	
	/**
	* Represents the number of times white B2 pawn has been moved
	*/
	public static int whitePawn1=0;
	
	/**
	* Represents the number of times white C2 pawn has been moved
	*/
	public static int whitePawn2=0;
	
	/**
	* Represents the number of times white D2 pawn has been moved
	*/
	public static int whitePawn3=0;
	
	/**
	* Represents the number of times white E2 pawn has been moved
	*/
	public static int whitePawn4=0;
	
	/**
	* Represents the number of times white F2 pawn has been moved
	*/
	public static int whitePawn5=0;
	
	/**
	* Represents the number of times white G2 pawn has been moved
	*/
	public static int whitePawn6=0;
	
	/**
	* Represents the number of times white H2 pawn has been moved
	*/
	public static int whitePawn7=0;
	
	
	/**
	* Represents whether the white A2 pawn has been moved
	*/
	public static boolean white0=false;
	
	/**
	* Represents whether the white B2 pawn has been moved
	*/
	public static boolean white1=false;
	
	/**
	* Represents whether the white C2 pawn has been moved
	*/
	public static boolean white2=false;
	
	/**
	* Represents whether the white D2 pawn has been moved
	*/
	public static boolean white3=false;
	
	/**
	* Represents whether the white E2 pawn has been moved
	*/
	public static boolean white4=false;
	
	/**
	* Represents whether the white F2 pawn has been moved
	*/
	public static boolean white5=false;
	
	/**
	* Represents whether the white G2 pawn has been moved
	*/
	public static boolean white6=false;
	
	/**
	* Represents whether the white H2 pawn has been moved
	*/
	public static boolean white7=false;
	
	/**
	* Represents  the total amount of moves made
	*/
	public static int count=1;
	
	/**
	 * This method is used to calculate whether the opposing player's King is in check or in checkmate
	 * after a move has been performed.
	 * 
	 * 
	 * @param  one    the opposing player's king color in character form
	 * @param  keys   a map that contains all of the board's pieces
	 * @return a string that tells whether the opposing player's King is in check or in checkmate     
	 */
	public static String iterate1(char one,HashMap <String,String> keys) {

		String location="";
		String key3=one+"K";
		String result="";
		HashMap <String,String> keys1=new HashMap<String, String>();
		HashMap <String,String> keys2=new HashMap<String, String>();
		ArrayList<String> posMoves2=new ArrayList<String>();
		ArrayList<String> posMoves5=new ArrayList<String>();
		ArrayList<String> posMoves6=new ArrayList<String>();
		ArrayList<String> posMoves7=new ArrayList<String>();
		int count=0;
		int count2=0;
		int count3=0;
		int count4=0;
		for(Map.Entry<String, String> e:keys.entrySet()) {
			if(e.getValue().compareTo(key3)==0) {
				location=e.getKey();
				break;
			}
		}
		for(Map.Entry<String, String> e:keys.entrySet()) {
			if(e.getValue().charAt(0)==key3.charAt(0)||(e.getValue().compareTo("  ")==0)||(e.getValue().compareTo("##")==0)) {
				if(e.getValue().charAt(0)==key3.charAt(0)) {
					keys2.put(e.getKey(), e.getValue());
				}
				continue;
			}
			else {
				keys1.put(e.getKey(), e.getValue());
			}
		}
		for(Map.Entry<String, String> m:keys1.entrySet()) {
			ArrayList<String> posMoves1=possibilities(m.getKey(), m.getValue(),"",keys);
			for(int i=0; i<posMoves1.size(); i++) {
				boolean x=posMoves2.contains(posMoves1.get(i));
				if(x==false) {
					posMoves2.add(posMoves1.get(i));
				}
			}
			if(posMoves1.contains(location)) {
				int f=Integer.parseInt(""+location.charAt(1));
				int two=Integer.parseInt(""+m.getKey().charAt(1));
				if (f>two) {
					for(int i=0; i<posMoves1.size(); i++) {
						String first=posMoves1.get(i);
						int number=Integer.parseInt(""+first.charAt(1));
						if(number>two && number<f) {
							posMoves7.add(first);
						}
					}
				}
				else if (f<two) {
					for(int i=0; i<posMoves1.size(); i++) {
						String first=posMoves1.get(i);
						int number=Integer.parseInt(""+first.charAt(1));
						if(number<two && number>f) {
							posMoves7.add(first);
						}
					}
				}
				for(int i=0; i<posMoves7.size(); i++) {
					for(Map.Entry<String, String> q:keys2.entrySet()) {
						boolean poss=validMove(q.getKey(), posMoves7.get(i), keys);
						if(poss) {
							count4++;
						}
					}
				}
				
				
				
				
				
				ArrayList<String> posMoves3=possibilities(location, keys.get(location),"",keys);
				
				for(Map.Entry<String, String> q:keys2.entrySet()) {
				if(q.getKey().compareTo(location)!=0) {
					ArrayList<String> posMoves4=possibilities(q.getKey(), q.getValue(),"",keys);
					for(int i=0; i<posMoves4.size(); i++) {
						if(posMoves5.contains(posMoves4.get(i))==false) {
							posMoves5.add(posMoves4.get(i));
						}
					}
				}
				}
				for(int i=0; i<posMoves3.size(); i++) {
					if(posMoves5.contains(posMoves3.get(i))) {
						for(Map.Entry<String, String> n:keys2.entrySet()) {
							boolean q=validMove(n.getKey(), posMoves3.get(i), keys);
							if(q==true) {
								count++;
							}	
						}
					}
				}
				for(int i=0; i<posMoves5.size(); i++) {
					if(posMoves5.get(i).compareTo(m.getKey())==0) {
						posMoves6.add(posMoves5.get(i));
					}
				}
				
				
				for(int i=0; i<posMoves3.size(); i++) {
					boolean q=validMove(location, posMoves3.get(i), keys);
					if(q==true) {
						count2++;
					}
				}
				for(int i=0; i<posMoves6.size(); i++) {
					for(Map.Entry<String, String> n:keys2.entrySet()) {
						boolean q=validMove(n.getKey(), posMoves6.get(i), keys);
						if(q==true) {
							count3+=1;
						}
					}
				}
				
				
				if(count2==0&&count==0&&count3==0&&count4==0) {
					result= "Checkmate";
					return result;
				}
				else {
					if(count>0||count3>0||count2>0||count4>0) {
						result= "Check";
						return result;	
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * This method is used to calculate whether the opposing player's King is in check or in checkmate
	 * after a move has been performed. It further prints the result to the terminal if the opposing player's
	 * king is in check or in checkmate
	 * 
	 * 
	 * @param  one    the opposing player's king color in character form
	 * @param  keys   a map that contains all of the board's pieces
	 * @return a string that tells whether the opposing player's King is in check or in checkmate     
	 */
	public static String iterate(char one,HashMap <String,String> keys) {
		String location="";
		String key3=one+"K";
		String result="";
		HashMap <String,String> keys1=new HashMap<String, String>();
		HashMap <String,String> keys2=new HashMap<String, String>();
		ArrayList<String> posMoves2=new ArrayList<String>();
		ArrayList<String> posMoves5=new ArrayList<String>();
		ArrayList<String> posMoves6=new ArrayList<String>();
		ArrayList<String> posMoves7=new ArrayList<String>();
		int count=0;
		int count2=0;
		int count3=0;
		int count4=0;
		for(Map.Entry<String, String> e:keys.entrySet()) {
			if(e.getValue().compareTo(key3)==0) {
				location=e.getKey();
				break;
			}
		}
		for(Map.Entry<String, String> e:keys.entrySet()) {
			if(e.getValue().charAt(0)==key3.charAt(0)||(e.getValue().compareTo("  ")==0)||(e.getValue().compareTo("##")==0)) {
				if(e.getValue().charAt(0)==key3.charAt(0)) {
					keys2.put(e.getKey(), e.getValue());
				}
				continue;
			}
			else {
				keys1.put(e.getKey(), e.getValue());
			}
		}
		for(Map.Entry<String, String> m:keys1.entrySet()) {
			ArrayList<String> posMoves1=possibilities(m.getKey(), m.getValue(),"",keys);
			for(int i=0; i<posMoves1.size(); i++) {
				boolean x=posMoves2.contains(posMoves1.get(i));
				if(x==false) {
					posMoves2.add(posMoves1.get(i));
				}
			}
			if(posMoves1.contains(location)) {
				int f=Integer.parseInt(""+location.charAt(1));
				int two=Integer.parseInt(""+m.getKey().charAt(1));
				if (f>two) {
					for(int i=0; i<posMoves1.size(); i++) {
						String first=posMoves1.get(i);
						int number=Integer.parseInt(""+first.charAt(1));
						if(number>two && number<f) {
							posMoves7.add(first);
						}
					}
				}
				else if (f<two) {
					for(int i=0; i<posMoves1.size(); i++) {
						String first=posMoves1.get(i);
						int number=Integer.parseInt(""+first.charAt(1));
						if(number<two && number>f) {
							posMoves7.add(first);
						}
					}
				}
				for(int i=0; i<posMoves7.size(); i++) {
					for(Map.Entry<String, String> q:keys2.entrySet()) {
						boolean poss=validMove(q.getKey(), posMoves7.get(i), keys);
						if(poss) {
							count4++;
						}
					}
				}
				ArrayList<String> posMoves3=possibilities(location, keys.get(location),"",keys);				
				for(Map.Entry<String, String> q:keys2.entrySet()) {
				if(q.getKey().compareTo(location)!=0) {
					ArrayList<String> posMoves4=possibilities(q.getKey(), q.getValue(),"",keys);
					for(int i=0; i<posMoves4.size(); i++) {
						if(posMoves5.contains(posMoves4.get(i))==false) {
							posMoves5.add(posMoves4.get(i));
						}
					}
				}
				}
				for(int i=0; i<posMoves3.size(); i++) {
					if(posMoves5.contains(posMoves3.get(i))) {
						for(Map.Entry<String, String> n:keys2.entrySet()) {
							boolean q=validMove(n.getKey(), posMoves3.get(i), keys);
							if(q==true) {
								count++;
							}	
						}
					}
				}
				for(int i=0; i<posMoves5.size(); i++) {
					if(posMoves5.get(i).compareTo(m.getKey())==0) {
						posMoves6.add(posMoves5.get(i));
					}
				}
				for(int i=0; i<posMoves3.size(); i++) {
					boolean q=validMove(location, posMoves3.get(i), keys);
					if(q==true) {
						count2++;
					}
				}
				for(int i=0; i<posMoves6.size(); i++) {
					for(Map.Entry<String, String> n:keys2.entrySet()) {
						boolean q=validMove(n.getKey(), posMoves6.get(i), keys);
						if(q==true) {
							count3+=1;
						}
					}
				}
				
				
				
				if(count2==0&&count==0&&count3==0&&count4==0) {
					result="Checkmate";
					System.out.println(result);
					return result;
				}
				else {
					if(count>0||count3>0||count2>0||count4>0) {
						result="Check";
						System.out.println(result);
						return result;	
					}
					
				}
				
				
				
				
			}
		}
	
		
		
		
		return result;
	}
	
	/**
	 * This method is used to calculate all of the possible moves for a given piece 
	 * 
	 * 
	 * 
	 * @param  start    the starting location for the piece
	 * @param  value    the value of the piece at the starting location
	 * @param  end      the ending location for the piece
	 * @param  keys     a map that contains all of the board's pieces
	 * @return a list of all possible moves for a given input      
	 */
	public static ArrayList<String> possibilities(String start,String value,String end,HashMap <String,String> keys) {
		ArrayList<String> possible =new ArrayList<String>();
		if(value.charAt(1)=='p') {
			int number=Integer.parseInt(""+start.charAt(1)+"");
			int index=letters.indexOf(""+start.charAt(0)+"");
			int number1=number+1; int number2=number+2; int number3=number-1; int number4=number-2;
			String posistion=""; String posistion2=""; String posistion3=""; String posistion4=""; String posistion5=""; String posistion6=""; String posistion7=""; String posistion8="";
			String a= "" + start.charAt(0) + "";
			if(value.charAt(0)=='w') {
				if(number1>0 && number1<9) {
					 posistion=a+number1;
					 if(keys.get(posistion)=="##" ||keys.get(posistion)=="  ") {
						 possible.add(posistion);
					 }
					 if(index+1>=0 && index+1<8) {
							String b=letters.get(index+1);
							posistion5=b+number1;
							String posistion10=b+number;
							int next=index+1;
							if(number==5&&keys.get(posistion10).compareTo("bp")==0&&(((keys.get(posistion5)).compareTo("##")==0)||((keys.get(posistion5)).compareTo("  ")==0))) {
								if(next==0) {
									if(black0==true &&blackPawn0!=0 && blackPawn0==count-1) {
										possible.add(posistion5);
									}
								}
								else if(next==1) {
									if(black1==true &&blackPawn1!=0 && blackPawn1==count-1) {
										possible.add(posistion5);
									}
									
								}
								else if(next==2) {
									if(black2==true &&blackPawn2!=0 && blackPawn2==count-1) {
										possible.add(posistion5);
									}
									
								}
								else if(next==3) {
									if(black3==true &&blackPawn3!=0 && blackPawn3==count-1) {
										possible.add(posistion5);
									}
								}
								else if(next==4) {
									if(black4==true &&blackPawn4!=0 && blackPawn4==count-1) {
										possible.add(posistion5);
									}
								}
								else if(next==5) {
									if(black5==true&&blackPawn5!=0 && blackPawn5==count-1) {
										possible.add(posistion5);
									}
								}
								else if(next==6) {
									if(black6==true&&blackPawn6!=0 && blackPawn6==count-1) {
										possible.add(posistion5);
									}
								}
								else if(next==7) {
									if(black7==true&&blackPawn7!=0 && blackPawn7==count-1) {
										possible.add(posistion5);
									}
								}
								
							}
							
							if(!(keys.get(posistion5)=="##" ||keys.get(posistion5)=="  ")&&keys.get(posistion5).charAt(0)=='b') {
								possible.add(posistion5);
							}
						}
					 if(index-1>=0 && index-1<8) {
							String b=letters.get(index-1);
							posistion6=b+number1;
							String posistion11=b+number;
							int next1=index-1;
							if(number==5&&keys.get(posistion11).compareTo("bp")==0&&(((keys.get(posistion6)).compareTo("##")==0)||((keys.get(posistion6)).compareTo("  ")==0))) {
								if(next1==0) {
									if(black0==true &&blackPawn0!=0 && blackPawn0==count-1) {
										possible.add(posistion6);
									}
								}
								else if(next1==1) {
									if(black1==true &&blackPawn1!=0 && blackPawn1==count-1) {
										possible.add(posistion6);
									}
									
								}
								else if(next1==2) {
									if(black2==true &&blackPawn2!=0 && blackPawn2==count-1) {
										possible.add(posistion6);
									}
									
								}
								else if(next1==3) {
									if(black3==true &&blackPawn3!=0 && blackPawn3==count-1) {
										possible.add(posistion6);
									}
								}
								else if(next1==4) {
									if(black4==true &&blackPawn4!=0 && blackPawn4==count-1) {
										possible.add(posistion6);
									}
								}
								else if(next1==5) {
									if(black5==true&&blackPawn5!=0 && blackPawn5==count-1) {
										possible.add(posistion6);
									}
								}
								else if(next1==6) {
									if(black6==true&&blackPawn6!=0 && blackPawn6==count-1) {
										possible.add(posistion6);
									}
								}
								else if(next1==7) {
									if(black7==true&&blackPawn7!=0 && blackPawn7==count-1) {
										possible.add(posistion6);
									}
								}
							
						}
							if(!(keys.get(posistion6)=="##" ||keys.get(posistion6)=="  ")&&keys.get(posistion6).charAt(0)=='b') {
								possible.add(posistion6);
							}
					}
	
				if(number2>0 && number2<9) {
					posistion2=a+number2;
					if(number==2) {
						if((keys.get(posistion)=="##" ||keys.get(posistion)=="  ") &&(keys.get(posistion2)=="##" ||keys.get(posistion2)=="  ")) {
							 possible.add(posistion2);
						 }
							}
					}
					 
			}
			}
			else if(value.charAt(0)=='b') {
				if(number3>0 && number3<9) {
					posistion3=a+number3;
					if(keys.get(posistion3)=="##" ||keys.get(posistion3)=="  ") {
						possible.add(posistion3);
					}
					if(index+1>=0 && index+1<8) {
						String b=letters.get(index+1);
						posistion7=b+number3;
						
						String posistion10=b+number;
						int next=index+1;
						if(number==4&&keys.get(posistion10).compareTo("wp")==0&&(((keys.get(posistion7)).compareTo("##")==0)||((keys.get(posistion7)).compareTo("  ")==0))) {
							if(next==0) {
								if(white0==true &&whitePawn0!=0 && whitePawn0==count-1) {
									possible.add(posistion7);
								}
							}
							else if(next==1) {
								if(white1==true &&whitePawn1!=0 && whitePawn1==count-1) {
									possible.add(posistion7);
								}
								
							}
							else if(next==2) {
								if(white2==true &&whitePawn2!=0 && whitePawn2==count-1) {
									possible.add(posistion7);
								}
								
							}
							else if(next==3) {
								if(white3==true &&whitePawn3!=0 && whitePawn3==count-1) {
									possible.add(posistion7);
								}
							}
							else if(next==4) {
								if(white4==true &&whitePawn4!=0 && whitePawn4==count-1) {
									possible.add(posistion7);
								}
							}
							else if(next==5) {
								if(white5==true&&whitePawn5!=0 && whitePawn5==count-1) {
									possible.add(posistion7);
								}
							}
							else if(next==6) {
								if(white6==true&&whitePawn6!=0 && whitePawn6==count-1) {
									possible.add(posistion7);
								}
							}
							else if(next==7) {
								if(white7==true&&whitePawn7!=0 && whitePawn7==count-1) {
									possible.add(posistion7);
								}
							}
							
						}
						
					
						
						if(!(keys.get(posistion7)=="##" ||keys.get(posistion7)=="  ")&&keys.get(posistion7).charAt(0)=='w') {
							possible.add(posistion7);
						}
					}
				 if(index-1>=0 && index-1<8) {
						String b=letters.get(index-1);
						posistion8=b+number3;
						String posistion11=b+number;
						int next1=index-1;
						if(number==4&&keys.get(posistion11).compareTo("wp")==0&&(((keys.get(posistion8)).compareTo("##")==0)||((keys.get(posistion8)).compareTo("  ")==0))) {
							if(next1==0) {
								if(white0==true &&whitePawn0!=0 && whitePawn0==count-1) {
									possible.add(posistion8);
								}
							}
							else if(next1==1) {
								if(white1==true &&whitePawn1!=0 && whitePawn1==count-1) {
									possible.add(posistion8);
								}
								
							}
							else if(next1==2) {
								if(white2==true &&whitePawn2!=0 && whitePawn2==count-1) {
									possible.add(posistion8);
								}
								
							}
							else if(next1==3) {
								if(white3==true &&whitePawn3!=0 && whitePawn3==count-1) {
									possible.add(posistion8);
								}
							}
							else if(next1==4) {
								if(white4==true &&whitePawn4!=0 && whitePawn4==count-1) {
									possible.add(posistion8);
								}
							}
							else if(next1==5) {
								if(white5==true&&whitePawn5!=0 && whitePawn5==count-1) {
									possible.add(posistion8);
								}
							}
							else if(next1==6) {
								if(white6==true&&whitePawn6!=0 && whitePawn6==count-1) {
									possible.add(posistion8);
								}
							}
							else if(next1==7) {
								if(white7==true&&whitePawn7!=0 && whitePawn7==count-1) {
									possible.add(posistion8);
								}
							}	
						
						
						
					}
						if(!(keys.get(posistion8)=="##" ||keys.get(posistion8)=="  ")&&keys.get(posistion8).charAt(0)=='w') {
							possible.add(posistion8);
						}
					
				}
				if(number4>0 && number4<9) {
					posistion4=a+number4;
					if(number==7) {
						 if((keys.get(posistion3)=="##" ||keys.get(posistion3)=="  ") &&(keys.get(posistion4)=="##" ||keys.get(posistion4)=="  ")) {
							 possible.add(posistion4);
						 }
					}
					
				}
			}
		}
		}
		else if(value.charAt(1)=='R') {
			 int number=Integer.parseInt(""+start.charAt(1)+"");
			 String a= "" + start.charAt(0) + "";
			 for(int i=number+1; i<9; i++) {
				 String posistion=a+i;
				 if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if((keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b'))) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion); 
					 }
				 }
				 else {
					 break;
				 }
			 }
			 for(int i=number-1; i>0; i--) {
				 String posistion=a+i;
				 if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion); 
					 }
				 }
				 else {
					 break;
				 }
			 }
			 int index=letters.indexOf(""+a+"");
			 for(int i=index+1; i<letters.size(); i++) {
				 String posistion=letters.get(i)+number;
				 if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion); 
					 }
				 }
				 else {
					 break;
				 } 
			 }
			 
			 for(int i=index-1; i>=0; i--) {
				 String posistion=letters.get(i)+number;
				 if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion); 
					 }
				 }
				 else {
					 break;
				 } 
			 }
		 }
		
		
		
		 else if(value.charAt(1)=='B') {
			int index=letters.indexOf(start.charAt(0)+"");
			int index2=letters.indexOf(start.charAt(0)+"");
			int index3=letters.indexOf(start.charAt(0)+"");
			int index4=letters.indexOf(start.charAt(0)+"");
			int number=Integer.parseInt(""+start.charAt(1)+"");
			int number2=Integer.parseInt(""+start.charAt(1)+"");
			int number3=Integer.parseInt(""+start.charAt(1)+"");
			int number4=Integer.parseInt(""+start.charAt(1)+"");
			int count=0;
			String one="";
			String posistion="";
			
			while(index<letters.size()&&number<9) {
				one =letters.get(index);
				posistion=one+(number);
				if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion);
					 }
				}
				else if(value.charAt(0)==keys.get(posistion).charAt(0)&&count!=0) {
					break;
				}
				number+=1;
				index+=1;
				count++;
				}
			count=0;
			
			while(index3>=0 &&number3<9) {
				one =letters.get(index3);
				posistion=one+(number3);
				if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion);
					 }
				}
				else if(value.charAt(0)==keys.get(posistion).charAt(0)&&count!=0){
					break;
				}
				number3+=1;
				index3-=1;
				count++;
			}
			count=0;
			while(index4<letters.size() &&number4>0) {
				one =letters.get(index4);
				posistion=one+(number4);
				if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion);
					 }
				}
				else if(value.charAt(0)==keys.get(posistion).charAt(0)&&count!=0){
					break;
				}
				number4-=1;
				index4+=1;
				count++;
			}
			count=0;
			while(index2>=0&&number2>0) {
				one =letters.get(index2);
				posistion=one+(number2);
				if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion);
					 }
				}
				else if(value.charAt(0)==keys.get(posistion).charAt(0)&&count!=0){
					break;
				}
				number2-=1;
				index2-=1;
				count++;
			}
		 }
		
		
		 else if(value.charAt(1)=='N') {
			 int number=Integer.parseInt(""+start.charAt(1)+"");

			 int index=letters.indexOf(start.charAt(0)+"");
			 String one=""; String two=""; String three=""; String four="";
			 if(index+1>=0 && index+1<8) {
				 one =letters.get(index+1);
			 }
			 if(index+2>=0 && index+2<8) {
				 two =letters.get(index+2);
			 }
			 if(index-1>=0 && index-1<8) {
				 three =letters.get(index-1);
			 }
			 if(index-2>=0 && index-2<8) {
				 four =letters.get(index-2);
			 }
			 int number1=number+1; int number2=number+2; int number3=number-1; int number4=number-2;
			 String posistion1="";String posistion2=""; String posistion3=""; String posistion4=""; String posistion5=""; String posistion6=""; String posistion7=""; String posistion8="";
			 if(number1>0 && number1<9) {
				 if(!(two=="")) {
					 posistion3=two+number1;
					 if((keys.get(posistion3)=="##"||keys.get(posistion3)=="  "||keys.get(posistion3).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion3).charAt(0)!=value.charAt(0)&&(keys.get(posistion3).charAt(0)=='w'||keys.get(posistion3).charAt(0)=='b'))) {
							 possible.add(posistion3);
						 }
						 else {
							 possible.add(posistion3); 
						 }
					 } 
				 }
				 if(!(four=="")) { 
				  posistion7=four+number1;
				  if((keys.get(posistion7)=="##"||keys.get(posistion7)=="  "||keys.get(posistion7).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion7).charAt(0)!=value.charAt(0)&&(keys.get(posistion7).charAt(0)=='w'||keys.get(posistion7).charAt(0)=='b'))) {
							 possible.add(posistion7);
						 }
						 else {
							 possible.add(posistion7); 
						 }
					 }
				 }
			 }
			 if(number2>0 && number2<9) {
				 if(!(one=="")) {
					posistion1=one+number2;
					if((keys.get(posistion1)=="##"||keys.get(posistion1)=="  "||keys.get(posistion1).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion1).charAt(0)!=value.charAt(0)&&(keys.get(posistion1).charAt(0)=='w'||keys.get(posistion1).charAt(0)=='b'))) {
							 possible.add(posistion1);
						 }
						 else {
							 possible.add(posistion1); 
						 }
					 }
				 }
				 if(!(three=="")) {
					posistion5=three+number2; 
					if((keys.get(posistion5)=="##"||keys.get(posistion5)=="  "||keys.get(posistion5).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion5).charAt(0)!=value.charAt(0)&&(keys.get(posistion5).charAt(0)=='w'||keys.get(posistion5).charAt(0)=='b'))) {
							 possible.add(posistion5);
						 }
						 else {
							 possible.add(posistion5); 
						 }
					 }
				 } 
			 }
			 if(number3>0 && number3<9) {
				 if(!(two=="")) {
					posistion4=two+number3;
					if((keys.get(posistion4)=="##"||keys.get(posistion4)=="  "||keys.get(posistion4).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion4).charAt(0)!=value.charAt(0)&&(keys.get(posistion4).charAt(0)=='w'||keys.get(posistion4).charAt(0)=='b'))) {
							 possible.add(posistion4);
						 }
						 else {
							 possible.add(posistion4); 
						 }
					 }
				 }
				 if(!(four=="")) {
					posistion8=four+number3;
					if((keys.get(posistion8)=="##"||keys.get(posistion8)=="  "||keys.get(posistion8).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion8).charAt(0)!=value.charAt(0)&&(keys.get(posistion8).charAt(0)=='w'||keys.get(posistion8).charAt(0)=='b'))) {
							 possible.add(posistion8);
						 }
						 else {
							 possible.add(posistion8); 
						 }
					 }
				 }
			 }
			 if(number4>0 && number4<9) {
				 if(!(one=="")) {
					posistion2=one+number4;
					if((keys.get(posistion2)=="##"||keys.get(posistion2)=="  "||keys.get(posistion2).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion2).charAt(0)!=value.charAt(0)&&(keys.get(posistion2).charAt(0)=='w'||keys.get(posistion2).charAt(0)=='b'))) {
							 possible.add(posistion2);
						 }
						 else {
							 possible.add(posistion2); 
						 }
					 }
				 }
				 if(!(three=="")) {
					 posistion6=three+number4; 
					 if((keys.get(posistion6)=="##"||keys.get(posistion6)=="  "||keys.get(posistion6).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion6).charAt(0)!=value.charAt(0)&&(keys.get(posistion6).charAt(0)=='w'||keys.get(posistion6).charAt(0)=='b'))) {
							 possible.add(posistion6);
						 }
						 else {
							 possible.add(posistion6); 
						 }
					 } 
				 }	 
			 }
			 
		 }
		 
		 else if(value.charAt(1)=='Q') {
			 int number=Integer.parseInt(""+start.charAt(1)+"");
			 String a= "" + start.charAt(0) + "";
			 for(int i=number+1; i<9; i++) {
				 String posistion=a+i;
				 if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if((keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b'))) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion); 
					 }
				 }
				 else {
					 break;
				 }
			 }
			 for(int i=number-1; i>0; i--) {
				 String posistion=a+i;
				 if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion); 
					 }
				 }
				 else {
					 break;
				 }
			 }
			 int index=letters.indexOf(""+a+"");
			 for(int i=index+1; i<letters.size(); i++) {
				 String posistion=letters.get(i)+number;
				 if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion); 
					 }
				 }
				 else {
					 break;
				 } 
			 }
			 for(int i=index-1; i>=0; i--) {
				 String posistion=letters.get(i)+number;
				 if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
					 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
						 possible.add(posistion);
						 break;
					 }
					 else {
						 possible.add(posistion); 
					 }
				 }
				 else {
					 break;
				 } 
			 }
			 
				int index1=letters.indexOf(start.charAt(0)+"");
				int index2=letters.indexOf(start.charAt(0)+"");
				int index3=letters.indexOf(start.charAt(0)+"");
				int index4=letters.indexOf(start.charAt(0)+"");
				int number1=Integer.parseInt(""+start.charAt(1)+"");
				int number2=Integer.parseInt(""+start.charAt(1)+"");
				int number3=Integer.parseInt(""+start.charAt(1)+"");
				int number4=Integer.parseInt(""+start.charAt(1)+"");
				int count=0;
				String one="";
				String posistion="";
				while(index1<letters.size()&&number1<9) {
					one =letters.get(index1);
					posistion=one+(number1);
					if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
						 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
							 possible.add(posistion);
							 break;
						 }
						 else {
							 possible.add(posistion);
						 }
					}
					else if(value.charAt(0)==keys.get(posistion).charAt(0)&&count!=0) {
						break;
					}
					number1+=1;
					index1+=1;
					count++;
					}
				count=0;
				
				while(index3>=0 &&number3<9) {
					one =letters.get(index3);
					posistion=one+(number3);
					if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
						 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
							 possible.add(posistion);
							 break;
						 }
						 else {
							 possible.add(posistion);
						 }
					}
					else if(value.charAt(0)==keys.get(posistion).charAt(0)&&count!=0){
						break;
					}
					number3+=1;
					index3-=1;
					count++;
				}
				count=0;
				
				while(index4<letters.size() &&number4>0) {
					one =letters.get(index4);
					posistion=one+(number4);
					if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
						 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
							 possible.add(posistion);
							 break;
						 }
						 else {
							 possible.add(posistion);
						 }
					}
					else if(value.charAt(0)==keys.get(posistion).charAt(0)&&count!=0){
						break;
					}
					number4-=1;
					index4+=1;
					count++;
				}
				count=0;
				while(index2>=0&&number2>0) {
					one =letters.get(index2);
					posistion=one+(number2);
					if((keys.get(posistion)=="##"||keys.get(posistion)=="  "||keys.get(posistion).charAt(0)!=value.charAt(0))) {
						 if(keys.get(posistion).charAt(0)!=value.charAt(0)&&(keys.get(posistion).charAt(0)=='w'||keys.get(posistion).charAt(0)=='b')) {
							 possible.add(posistion);
							 break;
						 }
						 else {
							 possible.add(posistion);
						 }
					}
					else if(value.charAt(0)==keys.get(posistion).charAt(0)&&count!=0){
						break;
					}
					number2-=1;
					index2-=1;
					count++;
				}
		 }
		 else if(value.charAt(1)=='K') {
			 int number=Integer.parseInt(""+start.charAt(1)+"");
			 int number1=number+1;
			 int number2=number-1;
			 int index=letters.indexOf(start.charAt(0)+"");
			 String one=""; String two=""; String three=""; String four=""; String five=""; String six="";
			 String posistion1=""; String posistion2=""; String posistion3=""; String posistion4=""; String posistion5=""; String posistion6=""; String posistion7=""; String posistion8="";
			 if(index+1>=0 && index+1<8) {
				 one=letters.get(index+1); 
			 }
			 if(index-1>=0 && index-1<8) {
				 two=letters.get(index-1); 
			 }
			if(start.compareTo("e1")==0&&value.compareTo("wK")==0&&whiteKingMoved==false &&end.compareTo("g1")==0&&(keys.get("f1").compareTo("  ")==0 &&keys.get("g1").compareTo("##")==0)&&whiteRook1Moved==false){
				 String s=iterate1('w', keys);
				 if(s.compareTo("Check")!=0 && s.compareTo("Checkmate")!=0) {
					 String posistion="g1";
						possible.add(posistion);
						whiteKingMoved=true;
						whiteRook1Moved=true;
				 }
				
			 }
			else if(start.compareTo("e1")==0&&value.compareTo("wK")==0&&whiteKingMoved==false &&end.compareTo("c1")==0&&(keys.get("c1").compareTo("##")==0 &&keys.get("d1").compareTo("  ")==0&&keys.get("b1").compareTo("  ")==0)&&whiteRook2Moved==false){
				String s=iterate1('w', keys);
				System.out.println();
				 if(s.compareTo("Check")!=0 && s.compareTo("Checkmate")!=0) {
					 String posistion="c1";
						possible.add(posistion);
						whiteKingMoved=true;
						whiteRook2Moved=true;
				 }
				
			 }
			else if(start.compareTo("e8")==0&&value.compareTo("bK")==0&&blackKingMoved==false &&end.compareTo("g8")==0&&(keys.get("f8").compareTo("##")==0 &&keys.get("g8").compareTo("  ")==0)&&blackRook1Moved==false){
				String s=iterate1('b', keys);
				 if(s.compareTo("Check")!=0 && s.compareTo("Checkmate")!=0) {
					 String posistion="g8";
						possible.add(posistion);
						blackKingMoved=true;
						blackRook1Moved=true;
				 }
			 }
			else if(start.compareTo("e8")==0&&value.compareTo("bK")==0&&blackKingMoved==false &&end.compareTo("c8")==0&&(keys.get("c8").compareTo("  ")==0 &&keys.get("d8").compareTo("##")==0&&keys.get("b8").compareTo("##")==0)&&blackRook2Moved==false){
				String s=iterate1('b', keys);
				 if(s.compareTo("Check")!=0 && s.compareTo("Checkmate")!=0) {
					 String posistion="c8";
						possible.add(posistion);
						blackKingMoved=true;
						blackRook2Moved=true;
				 }
			 }
			 
			 
			 
			 
			 if(number2>0) {
				 posistion1=start.charAt(0)+""+number2;
				 if((keys.get(posistion1)=="##"||keys.get(posistion1)=="  "||keys.get(posistion1).charAt(0)!=value.charAt(0))) {
					 if((keys.get(posistion1).charAt(0)!=value.charAt(0)&&(keys.get(posistion1).charAt(0)=='w'||keys.get(posistion1).charAt(0)=='b'))) {
						 possible.add(posistion1);
					 }
					 else {
						 possible.add(posistion1); 
					 }
				 }
			 }
			 if(number1>0 && number1<9) {
				 posistion2=start.charAt(0)+""+number1; 
				 if((keys.get(posistion2)=="##"||keys.get(posistion2)=="  "||keys.get(posistion2).charAt(0)!=value.charAt(0))) {
					 if((keys.get(posistion2).charAt(0)!=value.charAt(0)&&(keys.get(posistion2).charAt(0)=='w'||keys.get(posistion2).charAt(0)=='b'))) {
						 possible.add(posistion2);
					 }
					 else {
						 possible.add(posistion2); 
					 }
				 }
			 }
			 if(!(one=="")) {
				 posistion3=one+number;
				 if((keys.get(posistion3)=="##"||keys.get(posistion3)=="  "||keys.get(posistion3).charAt(0)!=value.charAt(0))) {
					 if((keys.get(posistion3).charAt(0)!=value.charAt(0)&&(keys.get(posistion3).charAt(0)=='w'||keys.get(posistion3).charAt(0)=='b'))) {
						 possible.add(posistion3);
					 }
					 else {
						 possible.add(posistion3); 
					 }
				 }
		
			 }
			 if(!(two=="")) {
				 posistion4=two+number;
				 if((keys.get(posistion4)=="##"||keys.get(posistion4)=="  "||keys.get(posistion4).charAt(0)!=value.charAt(0))) {
					 if((keys.get(posistion4).charAt(0)!=value.charAt(0)&&(keys.get(posistion4).charAt(0)=='w'||keys.get(posistion4).charAt(0)=='b'))) {
						 possible.add(posistion4);
					 }
					 else {
						 possible.add(posistion4); 
					 }
				 }
			 }
			 if(index+1<letters.size() && number1<9) {
				 three =letters.get(index+1);
					posistion5=three+(number1);
					if((keys.get(posistion5)=="##"||keys.get(posistion5)=="  "||keys.get(posistion5).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion5).charAt(0)!=value.charAt(0)&&(keys.get(posistion5).charAt(0)=='w'||keys.get(posistion5).charAt(0)=='b'))) {
							 possible.add(posistion5);
						 }
						 else {
							 possible.add(posistion5); 
						 }
					 }
			 }
			 if(index-1>=0&&number2>0) {
					four =letters.get(index-1);
					posistion6=four+(number2);
					if((keys.get(posistion6)=="##"||keys.get(posistion6)=="  "||keys.get(posistion6).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion6).charAt(0)!=value.charAt(0)&&(keys.get(posistion6).charAt(0)=='w'||keys.get(posistion6).charAt(0)=='b'))) {
							 possible.add(posistion6);
						 }
						 else {
							 possible.add(posistion6); 
						 }
					 }
	
				}
			 if(index+1<letters.size() && number2>0 &&number2<9) {
				  five =letters.get(index+1);
					posistion7=five+(number2);
					if((keys.get(posistion7)=="##"||keys.get(posistion7)=="  "||keys.get(posistion7).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion7).charAt(0)!=value.charAt(0)&&(keys.get(posistion7).charAt(0)=='w'||keys.get(posistion7).charAt(0)=='b'))) {
							 possible.add(posistion7);
						 }
						 else {
							 possible.add(posistion7); 
						 }
					 }
			 }
			 if(index-1>=0&&number1>0 && number1<9) {
					six =letters.get(index-1);
					posistion8=six+(number1);
					if((keys.get(posistion8)=="##"||keys.get(posistion8)=="  "||keys.get(posistion8).charAt(0)!=value.charAt(0))) {
						 if((keys.get(posistion8).charAt(0)!=value.charAt(0)&&(keys.get(posistion8).charAt(0)=='w'||keys.get(posistion8).charAt(0)=='b'))) {
							 possible.add(posistion8);
						 }
						 else {
							 possible.add(posistion8); 
						 }
					 }
	
				}
				
		 }
		return possible;
	}
	
	
	
	
	
	/**
	 * This method is used to calculate whether it is possible for a given piece to execute a move 
	 * 
	 * 
	 * 
	 * @param  start    the starting location for the piece
	 * @param  end      the ending location for the piece
	 * @param  keys     a map that contains all of the board's pieces
	 * @return a boolean that tells whether a given move can be executed     
	 */
	public static boolean validMove(String start, String end,HashMap <String,String> keys) {
		boolean possible=false;
		String key = keys.get(start);
		String key2 = keys.get(end);
		String key3=key.charAt(0)+"K";
		String location="";
		for(Map.Entry<String, String> e:keys.entrySet()) {
			if(e.getValue().compareTo(key3)==0) {
				location=e.getKey();
				break;
			}
		}
		if(key.charAt(1)=='R') {
			ArrayList<String> posMoves=possibilities(start, key,end,keys);
			if(posMoves.contains(end)) {
				keys.replace(start,"  ");
				keys.replace(end, key);
				
				for(Map.Entry<String, String> e:keys.entrySet()) {
					if(e.getValue().charAt(0)==key.charAt(0)||(e.getValue().compareTo("  ")==0)||(e.getValue().compareTo("##")==0)) {
						continue;
					}
					else {
						ArrayList<String> posMoves1=possibilities(e.getKey(), e.getValue(),end,keys);
						for(Map.Entry<String, String> n:keys.entrySet()) {
							if(n.getValue().compareTo(key3)==0) {
								location=n.getKey();
								break;
							}
						}
						if(posMoves1.contains(location)) {
							keys.replace(start,key);
							keys.replace(end, key2);
							return false;
						}
					}
				}
				possible=true;
				keys.replace(start,key);
				keys.replace(end, key2);
			}
		}
		
		
		
		else if(key.charAt(1)=='N') {
			ArrayList<String> posMoves=possibilities(start, key,end,keys);
			if(posMoves.contains(end)) {
				keys.replace(start,"  ");
				keys.replace(end, key);
				for(Map.Entry<String, String> e:keys.entrySet()) {
					if(e.getValue().charAt(0)==key.charAt(0)||(e.getValue().compareTo("  ")==0)||(e.getValue().compareTo("##")==0)) {
						continue;
					}
					else {
						ArrayList<String> posMoves1=possibilities(e.getKey(), e.getValue(),end,keys);
						for(Map.Entry<String, String> n:keys.entrySet()) {
							if(n.getValue().compareTo(key3)==0) {
								location=n.getKey();
								break;
							}
						}
						if(posMoves1.contains(location)) {
							keys.replace(start,key);
							keys.replace(end, key2);
							return false;
						}
					}
				}
				possible=true;
				keys.replace(start,key);
				keys.replace(end, key2);
			}
		}
		else if(key.charAt(1)=='B') {
			ArrayList<String> posMoves=possibilities(start, key,end,keys);
			if(posMoves.contains(end)) {
				keys.replace(start,"  ");
				keys.replace(end, key);
				for(Map.Entry<String, String> e:keys.entrySet()) {
					if(e.getValue().charAt(0)==key.charAt(0)||(e.getValue().compareTo("  ")==0)||(e.getValue().compareTo("##")==0)) {
						continue;
					}
					else {
						ArrayList<String> posMoves1=possibilities(e.getKey(), e.getValue(),end,keys);
						for(Map.Entry<String, String> n:keys.entrySet()) {
							if(n.getValue().compareTo(key3)==0) {
								location=n.getKey();
								break;
							}
						}
						if(posMoves1.contains(location)) {
							keys.replace(start,key);
							keys.replace(end, key2);
							return false;
						}
					}
				}
				possible=true;
				keys.replace(start,key);
				keys.replace(end, key2);
			}
		}
		else if(key.charAt(1)=='Q') {
			ArrayList<String> posMoves=possibilities(start, key,end,keys);
			if(posMoves.contains(end)) {
				keys.replace(start,"  ");
				keys.replace(end, key);
				for(Map.Entry<String, String> e:keys.entrySet()) {
					if(e.getValue().charAt(0)==key.charAt(0)||(e.getValue().compareTo("  ")==0)||(e.getValue().compareTo("##")==0)) {
						continue;
					}
					else {
						ArrayList<String> posMoves1=possibilities(e.getKey(), e.getValue(),end,keys);
						for(Map.Entry<String, String> n:keys.entrySet()) {
							if(n.getValue().compareTo(key3)==0) {
								location=n.getKey();
								break;
							}
						}
						if(posMoves1.contains(location)) {
							keys.replace(start,key);
							keys.replace(end, key2);
							return false;
						}
					}
				}
				possible=true;
				keys.replace(start,key);
				keys.replace(end, key2);
			}
		}
		else if(key.charAt(1)=='K') {
			ArrayList<String> posMoves=possibilities(start, key,end,keys);
			if(posMoves.contains(end)) {
				keys.replace(start,"  ");
				keys.replace(end, key);
				for(Map.Entry<String, String> e:keys.entrySet()) {
					if(e.getValue().charAt(0)==key.charAt(0)||(e.getValue().compareTo("  ")==0)||(e.getValue().compareTo("##")==0)) {
						continue;
					}
					else {
						ArrayList<String> posMoves1=possibilities(e.getKey(), e.getValue(),end,keys);
						for(Map.Entry<String, String> n:keys.entrySet()) {
							if(n.getValue().compareTo(key3)==0) {
								location=n.getKey();
								break;
							}
						}
						if(posMoves1.contains(location)) {
							keys.replace(start,key);
							keys.replace(end, key2);
							return false;
						}
					}
				}if(key.charAt(0)=='b') {
					blackKingMoved=true;
				}
				else {
					whiteKingMoved=true;
				}
				possible=true;
				keys.replace(start,key);
				keys.replace(end, key2);
			}
		}
		else if(key.charAt(1)=='p') {
			ArrayList<String> posMoves=possibilities(start, key,end,keys);
			if(posMoves.contains(end)) {
				keys.replace(start,"  ");
				keys.replace(end, key);
				for(Map.Entry<String, String> e:keys.entrySet()) {
					if(e.getValue().charAt(0)==key.charAt(0)||(e.getValue().compareTo("  ")==0)||(e.getValue().compareTo("##")==0)) {
						continue;
					}
					else {
						ArrayList<String> posMoves1=possibilities(e.getKey(), e.getValue(),end,keys);
						for(Map.Entry<String, String> n:keys.entrySet()) {
							if(n.getValue().compareTo(key3)==0) {
								location=n.getKey();
								break;
							}
						}
						if(posMoves1.contains(location)) {
							keys.replace(start,key);
							keys.replace(end, key2);
							return false;
						}
					}
				}
				keys.replace(start,key);
				keys.replace(end, key2);
				possible=true;
			}
		}
		
		return possible;
	}
	
	
	
	/**
	 * This method is used to print out the chess board after a move has been executed 
	 * 
	 * 
	 * 
	 * @param  c    an ordered list of type string that contains the contents of the board    
	 */
	public static void draw(ArrayList<String> c){
		String[] a = {"a","b","c","d","e","f","g","h"};
		String [][] n=new String[9][9];
		int k=0;
		int p=0;
		String row="";
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n.length; j++) {
				if(i==n.length-1) {
					if(p==n.length-1) {
						n[i][j]="";
					}
					else {
					n[i][j]=" " +a[p];
					}
					p++;		
				}
				else if(j==n.length-1) {
					n[i][j]=row;
				}
				else {
					row=c.get(k).substring(1,2);
					n[i][j]=c.get(k).substring(3);
					k++;
				}
				
			}
		}
		board=n;
		for(int d=0; d<board.length; d++) {
			for(int v=0; v<board.length; v++) {
				if(v!=board.length-1) {
					System.out.print(board[d][v] + " ");
				}
				else {
					System.out.print(board[d][v]+"\n");
				}
				
			}
		}
	}
	
	
	
	/**
	 * This method is used to sort a map into a list according to the order of the chess board  
	 * 
	 * 
	 * 
	 * @param  f an unordered map that contains the values of the chess board    
	 * @return a ordered list that contains the values of the chess board
	 */
	public static ArrayList<String> sort(HashMap<String,String> f) {
		ArrayList<String> q=new ArrayList<String>();
		for(Map.Entry<String, String> e:f.entrySet()) {
			if(q.size()==0) {
				q.add(e.getKey()+"="+e.getValue());
			}
			else {
				for(int i=0; i<q.size(); i++) {
					String x=q.get(i);
					String input=x.substring(0, 2);
					int comparison1=Character.compare(e.getKey().charAt(1),input.charAt(1));
					if(comparison1==0) {
						int comparison=Character.compare(e.getKey().charAt(0),input.charAt(0));
						if(comparison<0||i==q.size()-1) {
							if(comparison>0 && i==q.size()-1) {
								q.add(i+1, e.getKey()+"="+e.getValue());
								break;
							}
							else {
								q.add(i, e.getKey()+"="+e.getValue());
								break;	
							}
							
						}
					else if(comparison>0) {
						continue;
					}
				}
				else if(comparison1<0) {
					continue;
				}
				else {
					q.add(i, e.getKey()+"="+e.getValue());
					break;
				}
					
				}
			}
		}	
return q;					
	}
	
	 /**
	   * This is the main method which draws the initial board and runs the loop that queries both players for their
	   * moves.  
	   * @param args Unused.
	   */
	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		String first="b"; String second="w"; String third="##"; String fourth="p";
		int num=8;
		String[] q={"R","N","B","Q","K","B","N","R",Integer.toString(num)};
		String[] a={"a","b","c","d","e","f","g","h"};
		int p=0;
		int c=0;
		HashMap <String,String> board2=new HashMap<String,String>();
		for (int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				// System.out.println();
				if((i==0 || i==1) && c!=q.length-1) {
						if(i==0) {
							board[i][j]=first+q[c];
							board2.put(a[j]+q[q.length-1], first+q[c]);
						}
						else {
							board[i][j]=first+fourth;
							board2.put(a[j]+q[q.length-1], first+fourth);
						}
						c++;
				}
				else if((i==0 || i==1) && c==q.length-1) {
					board[i][j]=q[c];
					num--;
					q[c]=Integer.toString(num);
						}
						
				else if (i==board.length-1) {
					if(p!=a.length) {
						board[i][j]=" " +a[p];
						p++;
					}
					else {
						board[i][j]="";
					}
						
				}
				else if(i==2 || i==4) {
					if(c%2==1&&c!=q.length-1) {
						board2.put(a[j]+q[q.length-1], third);
						board[i][j]=third;
					}
					else if(c==q.length-1) {
						board[i][j]=q[c];
						num--;
						q[c]=Integer.toString(num);
					}
					else {
						board[i][j]="" + "  ";
						board2.put(a[j]+q[q.length-1], "" + "  ");
					}
					c++;
				}
				else if(i==3 || i==5) {
					if(c%2==0 && c!=q.length-1) {
						board[i][j]=third;
						board2.put(a[j]+q[q.length-1], third);
					}
					else if(c==q.length-1) {
						board[i][j]=q[c];
						num--;
						q[c]=Integer.toString(num);
					}
					else {
						board[i][j]="" + "  ";
						board2.put(a[j]+q[q.length-1], "" + "  ");
					}
					c++;
				}

				else if((i==6 || i==7) && c!=q.length-1) {
					if(i==7) {
						board[i][j]=second+q[c];
						board2.put(a[j]+q[q.length-1], second+q[c]);
					}
					else {
						board[i][j]=second+fourth;	
						board2.put(a[j]+q[q.length-1], second+fourth);
					}
					c++;
			}
				else if((i==6 || i==7) && c==q.length-1) {
					board[i][j]=q[c];
					num--;
					q[c]=Integer.toString(num);
					}
				else{
					c++;
				}
			}
			c=0;
			p=0;
		}
		
		// System.out.println(board2);
		
		
		for(int d=0; d<board.length; d++) {
			for(int v=0; v<board.length; v++) {
				if(v!=board.length-1) {
					System.out.print(board[d][v] + " ");
				}
				else {
					System.out.print(board[d][v]+"\n");
				}
				
			}
		}
		//Need to fix
		String turn="white";
		char final1=' ';
		int firstAttempt=0;
		boolean finished=false;
		System.out.println();
		String draw="";
		while(finished==false) {
			if(count%2==1) {
				System.out.print("White's move: ");
				turn="white";
			}
			else if(count%2==0) {
				System.out.print("Black's move: ");
				turn="black";
			}
			String input =x.nextLine();
			String inputs[]=input.split(" ");
			
			if(input.compareTo("resign")==0||(inputs.length==3 &&inputs[2].compareTo("draw?")==0)) {
				if(input.compareTo("resign")==0 &&count%2==0) {
					System.out.println("White wins");
					break;
				}
				else if(input.compareTo("resign")==0 &&count%2==1) {
					System.out.println("Black wins");
					break;
				}
				else if(inputs.length==3 && inputs[2].compareTo("draw?")==0){
					count++;
					if(count%2==0) {
						draw="Black";
					}
					else if(count%2==1) {
						draw="White";
					}
					count=-1;
					break;
				}
			}
			
			if(firstAttempt==0) {
				StringTokenizer y=new StringTokenizer(input, " ");
				String one=y.nextToken();
				while(one.charAt(1)=='7'||one.charAt(1)=='8') {
					System.out.println("Illegal move, try again");
					System.out.print("White's move:" + " ");
					input =x.nextLine();
					y=new StringTokenizer(input, " ");
					one=y.nextToken();
				}
				String[]tokens=input.split(" ");
//				if(board2.get(tokens[0]).charAt(0)=='w') {
//					final1='b';
//				}
//				else {
//					final1='w';
//				}
				
				if(input.compareTo("resign")==0||(tokens.length==3 &&tokens[2].compareTo("draw?")==0)) {
					if(input.compareTo("resign")==0 &&count%2==0) {
						System.out.println("White wins");
						break;
					}
					else if(input.compareTo("resign")==0 &&count%2==1) {
						System.out.println("Black wins");
						break;
					}
					else if(tokens.length==3 && tokens[2].compareTo("draw?")==0){
						count++;
						if(count%2==0) {
							draw="Black";
						}
						else if(count%2==1) {
							draw="White";
						}
						count=-1;
						break;
					}
				}
				boolean valid=validMove(tokens[0], tokens[1],board2);
				if(!valid) {
					while(!valid) {
						if(tokens[0].charAt(1)=='7'||tokens[0].charAt(1)=='8') {
							System.out.println("Illegal move, try again");
							System.out.print("White's move:" + " ");
							input=x.nextLine();
							tokens=input.split(" ");
							if(input.compareTo("resign")==0||(inputs.length==3 &&inputs[2].compareTo("draw?")==0)) {
								if(input.compareTo("resign")==0 &&count%2==0) {
									System.out.println("White wins");
									count=-4;
									break;
								}
								else if(input.compareTo("resign")==0 &&count%2==1) {
									System.out.println("Black wins");
									count=-4;
									break;
								}
								else if(inputs.length==3 && inputs[2].compareTo("draw?")==0){
									count++;
									if(count%2==0) {
										draw="Black";
									}
									else if(count%2==1) {
										draw="White";
									}
									count=-1;
									break;
								}
							}
							else if(turn.charAt(0)==(board2.get(tokens[0])).charAt(0)) {
							valid=validMove(tokens[0], tokens[1],board2);	
							}
						}
						else {
							System.out.println("Illegal move, try again");
							System.out.print("White's move:" + " ");
							input=x.nextLine();
							tokens=input.split(" ");
							if(input.compareTo("resign")==0||(tokens.length==3 &&tokens[2].compareTo("draw?")==0)) {
								if(input.compareTo("resign")==0 &&count%2==0) {
									System.out.println("White wins");
									count=-4;
									break;
								}
								else if(input.compareTo("resign")==0 &&count%2==1) {
									System.out.println("Black wins");
									count=-4;
									break;
								}
								else if(tokens.length==3 && tokens[2].compareTo("draw?")==0){
									count++;
									if(count%2==0) {
										draw="Black";
									}
									else if(count%2==1) {
										draw="White";
									}
									count=-1;
									break;
								}
							}
							else if(turn.charAt(0)==(board2.get(tokens[0])).charAt(0)) {
								valid=validMove(tokens[0], tokens[1],board2);	
							}
							
						}
					}
					if(count==-1||count==-4) {
						break;
					}
				}
				if(valid) {
					if(board2.get(tokens[0]).charAt(0)=='w') {
						final1='b';
					}
					else {
						final1='w';
					}		
					firstAttempt++;	
					turn="black";
					if(tokens[1].charAt(1)=='8' && board2.get(tokens[0]).charAt(1)=='p'&&tokens.length==3) {
						String s= board2.get(tokens[0]).charAt(0)+tokens[2];
						board2.replace(tokens[1], s);
					}
					else if(tokens[1].charAt(1)=='8' && board2.get(tokens[0]).charAt(1)=='p'&&tokens.length==2) {
						String s= board2.get(tokens[0]).charAt(0)+"Q";
						board2.replace(tokens[1], s);
					}
					else if(tokens[1].charAt(1)=='1' && board2.get(tokens[0]).charAt(1)=='p'&&tokens.length==3) {
						String s= board2.get(tokens[0]).charAt(0)+tokens[3];
						board2.replace(tokens[1], s);
					}
					else if(tokens[1].charAt(1)=='1' && board2.get(tokens[0]).charAt(1)=='p'&&tokens.length==2) {
						String s= board2.get(tokens[0]).charAt(0)+"Q";
						board2.replace(tokens[1], s);
					}
					else {
						if(tokens[0].compareTo("e1")==0 && (board2.get(tokens[0])).compareTo("wK")==0&& tokens[1].compareTo("g1")==0) {
						board2.replace("f1", board2.get("h1"));
						board2.replace("h1","  ");
						}
						else if(tokens[0].compareTo("e1")==0 &&(board2.get(tokens[0])).compareTo("wK")==0 && tokens[1].compareTo("c1")==0) {
							board2.replace("d1", board2.get("a1"));
							board2.replace("a1","##");
						}
						
						else if(tokens[0].compareTo("e8")==0 &&(board2.get(tokens[0])).compareTo("bK")==0&&tokens[1].compareTo("g8")==0) {
							board2.replace("f8", board2.get("h8"));
							board2.replace("h8","##");
						}
						else if(tokens[0].compareTo("e8")==0 &&(board2.get(tokens[0])).compareTo("bK")==0&&tokens[1].compareTo("c8")==0) {
							board2.replace("d8", board2.get("a8"));
							board2.replace("a8","  ");
						}
						board2.replace(tokens[1], board2.get(tokens[0]));	
					}
					String row=tokens[0].charAt(0)+"";
					String col=tokens[0].charAt(1)+"";
					int number=Integer.parseInt(col);
					if(row.compareTo("a")==0 || row.compareTo("c")==0 || row.compareTo("e")==0|| row.compareTo("g")==0) {
						if(number%2==1) {
						board2.replace(tokens[0], "##");
						}
						else {
							board2.replace(tokens[0], "  ");
						}
					}
					else if (row.compareTo("b")==0 || row.compareTo("d")==0 || row.compareTo("f")==0|| row.compareTo("h")==0){
						if(number%2==1) {
							board2.replace(tokens[0], "  ");
							}
							else {
								board2.replace(tokens[0], "##");
							}
					}
					ArrayList<String> alter =sort(board2);
					System.out.println();
					draw(alter);
					System.out.println();
					String result=iterate(final1, board2);
					if(result.compareTo("Checkmate")==0) {
						if(count%2==1) {
							System.out.println("White wins");
						}
						else {
							System.out.println("Black wins");
						}
						break;
					}
					turn="black";
					count++;
			}
			}
				else {
					String[]tokens=input.split(" ");
//					if(board2.get(tokens[0]).charAt(0)=='w') {
//						final1='b';
//					}
//					else {
//						final1='w';
//					}
					boolean valid=false;
					if(turn.charAt(0)==((board2.get(tokens[0])).charAt(0))) {
						valid=validMove(tokens[0], tokens[1],board2);
					}
					
					if(!valid) {
						while(!valid) {
							System.out.println("Illegal move, try again");
							if(count%2==0) {
								System.out.print("Black's move:" + " ");
							}
							else {
								System.out.print("White's move:" + " ");
							}
							input=x.nextLine();
							tokens=input.split(" ");
							if(input.compareTo("resign")==0||(tokens.length==3 &&tokens[2].compareTo("draw?")==0)) {
								if(input.compareTo("resign")==0 &&count%2==0) {
									System.out.println("White wins");
									count=-4;
									break;
								}
								else if(input.compareTo("resign")==0 &&count%2==1) {
									System.out.println("Black wins");
									count=-4;
									break;
								}
								else if(tokens.length==3 && tokens[2].compareTo("draw?")==0){
									count++;
									if(count%2==0) {
										draw="Black";
									}
									else if(count%2==1) {
										draw="White";
									}
									count=-1;
									break;
								}
							}
							if(turn.charAt(0)==(board2.get(tokens[0]).charAt(0))) {
								valid=validMove(tokens[0], tokens[1],board2);
							}
//							valid=validMove(tokens[0], tokens[1],board2);
						}
						if(count==-1||count==-4) {
							break;
						}
					}
					if(valid) {
//							turn="white";				
						if(board2.get(tokens[0]).charAt(0)=='w') {
							final1='b';
						}
						else {
							final1='w';
						}		
						if(tokens[1].charAt(1)=='8' && board2.get(tokens[0]).charAt(1)=='p'&&tokens.length==3) {
							String s= board2.get(tokens[0]).charAt(0)+tokens[2];
							board2.replace(tokens[1], s);
						}
						else if(tokens[1].charAt(1)=='8' && board2.get(tokens[0]).charAt(1)=='p'&&tokens.length==2) {
							String s= board2.get(tokens[0]).charAt(0)+"Q";
							board2.replace(tokens[1], s);
						}
						else if(tokens[1].charAt(1)=='1' && board2.get(tokens[0]).charAt(1)=='p'&&tokens.length==3) {
							String s= board2.get(tokens[0]).charAt(0)+tokens[2];
							board2.replace(tokens[1], s);
						}
						else if(tokens[1].charAt(1)=='1' && board2.get(tokens[0]).charAt(1)=='p'&&tokens.length==2) {
							String s= board2.get(tokens[0]).charAt(0)+"Q";
							board2.replace(tokens[1], s);
						}
						else {
							
							if(tokens[0].charAt(1)=='7' && tokens[1].charAt(1)=='5' && tokens[0].compareTo("a7")==0&& board2.get(tokens[0]).compareTo("bp")==0&&black0==false) {
								black0=true;
								blackPawn0=count;
							}
							else if(tokens[0].charAt(1)=='7' && tokens[1].charAt(1)=='5' && tokens[0].compareTo("b7")==0 && board2.get(tokens[0]).compareTo("bp")==0&&black1==false) {
								black1=true;
								blackPawn1=count;
							}
	                        else if(tokens[0].charAt(1)=='7' && tokens[1].charAt(1)=='5' && tokens[0].compareTo("c7")==0 && board2.get(tokens[0]).compareTo("bp")==0&&black2==false) {
	                        	black2=true;
	                        	blackPawn2=count;
							}
	                        else if(tokens[0].charAt(1)=='7' && tokens[1].charAt(1)=='5' && tokens[0].compareTo("d7")==0 && board2.get(tokens[0]).compareTo("bp")==0&&black3==false) {
	                        	black3=true;
	                        	blackPawn3=count;
							}
	                        else if(tokens[0].charAt(1)=='7' && tokens[1].charAt(1)=='5' && tokens[0].compareTo("e7")==0 && board2.get(tokens[0]).compareTo("bp")==0&&black4==false) {
	                        	black4=true;
	                        	blackPawn4=count;
							}
	                        else if(tokens[0].charAt(1)=='7' && tokens[1].charAt(1)=='5' && tokens[0].compareTo("f7")==0 && board2.get(tokens[0]).compareTo("bp")==0&&black5==false) {
	                        	black5=true;
	                        	blackPawn5=count;
							}
	                        else if(tokens[0].charAt(1)=='7' && tokens[1].charAt(1)=='5' && tokens[0].compareTo("g7")==0 && board2.get(tokens[0]).compareTo("bp")==0 &&black6==false) {
	                        	black6=true;
	                        	blackPawn6=count;
							}
	                        else if(tokens[0].charAt(1)=='7' && tokens[1].charAt(1)=='5' && tokens[0].compareTo("h7")==0 && board2.get(tokens[0]).compareTo("bp")==0&&black7==false) {
								black7=true;
								blackPawn7=count;
							}
	                        else if(tokens[0].charAt(1)=='2' && tokens[1].charAt(1)=='4' && tokens[0].compareTo("a2")==0&& board2.get(tokens[0]).compareTo("wp")==0&&white0==false) {
	                        	white0=true;
	                        	whitePawn0=count;
							}
							else if(tokens[0].charAt(1)=='2' && tokens[1].charAt(1)=='4' && tokens[0].compareTo("b2")==0 && board2.get(tokens[0]).compareTo("wp")==0&&white1==false) {
								white1=true;
								whitePawn1=count;
							}
	                        else if(tokens[0].charAt(1)=='2' && tokens[1].charAt(1)=='4' && tokens[0].compareTo("c2")==0 && board2.get(tokens[0]).compareTo("wp")==0&&white2==false) {
	                        	white2=true;
	                        	whitePawn2=count;
							}
	                        else if(tokens[0].charAt(1)=='2' && tokens[1].charAt(1)=='4' && tokens[0].compareTo("d2")==0 && board2.get(tokens[0]).compareTo("wp")==0&&white3==false) {
	                        	white3=true;
	                        	whitePawn3=count;
							}
	                        else if(tokens[0].charAt(1)=='2' && tokens[1].charAt(1)=='4' && tokens[0].compareTo("e2")==0 && board2.get(tokens[0]).compareTo("wp")==0&&white4==false) {
	                        	white4=true;
	                        	whitePawn4=count;
							}
	                        else if(tokens[0].charAt(1)=='2' && tokens[1].charAt(1)=='4' && tokens[0].compareTo("f2")==0 && board2.get(tokens[0]).compareTo("wp")==0&&white5==false) {
	                        	white5=true;
	                        	whitePawn5=count;
							}
	                        else if(tokens[0].charAt(1)=='2' && tokens[1].charAt(1)=='4' && tokens[0].compareTo("g2")==0 && board2.get(tokens[0]).compareTo("wp")==0&&white6==false) {
								white6=true;
								whitePawn6=count;
							}
	                        else if(tokens[0].charAt(1)=='2' && tokens[1].charAt(1)=='4' && tokens[0].compareTo("h2")==0 && board2.get(tokens[0]).compareTo("wp")==0&&white7==false) {
								white7=true;
								whitePawn7=count;
							}
	                        else if((board2.get(tokens[0])).charAt(1)=='p'){
		                         if((black0==true && blackPawn0==count-1)||(black1==true && blackPawn1==count-1)||(black2==true && blackPawn2==count-1)||(black3==true && blackPawn3==count-1)||(black4==true && blackPawn4==count-1)||(black5==true && blackPawn5==count-1)||(black6==true && blackPawn6==count-1)||(black7==true && blackPawn7==count-1)) {
									int index=letters.indexOf(""+tokens[0].charAt(0));
		                        	int index1=letters.indexOf(""+tokens[1].charAt(0));
		                        	int number2=Integer.parseInt(""+tokens[0].charAt(1));
		                        	int number3=Integer.parseInt(""+tokens[1].charAt(1));
		                        	if(Math.abs(index1-index)==1&&Math.abs(number2-number3)==1) {
		                        		
			                        	int number=Integer.parseInt(""+tokens[0].charAt(1));
			                        		String row=tokens[1].charAt(0)+"";
			                        		String right=row+number;
			        						if(row.compareTo("a")==0 || row.compareTo("c")==0 || row.compareTo("e")==0|| row.compareTo("g")==0) {
			        							if(number%2==1) {
			        							board2.replace(right, "##");
			        							}
			        							else {
			        								board2.replace(right, "  ");
			        							}
			        						}
			        						else if (row.compareTo("b")==0 || row.compareTo("d")==0 || row.compareTo("f")==0|| row.compareTo("h")==0){
			        							if(number%2==1) {
			        								board2.replace(right, "  ");
			        								}
			        								else {
			        									board2.replace(right, "##");
			        								}
			        						}
		                        	}
		                        	
									
								}
		                        else if((white0==true && whitePawn0==count-1)||(white1==true && whitePawn1==count-1)||(white2==true && whitePawn2==count-1)||(white3==true && whitePawn3==count-1)||(white4==true && whitePawn4==count-1)||(white5==true && whitePawn5==count-1)||(white6==true && whitePawn6==count-1)||(white7==true && whitePawn7==count-1)) {
									int index=letters.indexOf(""+tokens[0].charAt(0));
		                        	int index1=letters.indexOf(""+tokens[1].charAt(0));
		                        	int number2=Integer.parseInt(""+tokens[0].charAt(1));
		                        	int number3=Integer.parseInt(""+tokens[1].charAt(1));
		                        	if(Math.abs(index1-index)==1&&Math.abs(number2-number3)==1) {
			                        	int number=Integer.parseInt(""+tokens[0].charAt(1));
			                        		String row=tokens[1].charAt(0)+"";
			                        		String right=row+number;
			        						if(row.compareTo("a")==0 || row.compareTo("c")==0 || row.compareTo("e")==0|| row.compareTo("g")==0) {
			        							if(number%2==1) {
			        							board2.replace(right, "##");
			        							}
			        							else {
			        								board2.replace(right, "  ");
			        							}
			        						}
			        						else if (row.compareTo("b")==0 || row.compareTo("d")==0 || row.compareTo("f")==0|| row.compareTo("h")==0){
			        							if(number%2==1) {
			        								board2.replace(right, "  ");
			        								}
			        								else {
			        									board2.replace(right, "##");
			        								}
			        						}
											
		                        	}
		                        	
								}
									                        	
	                        }

	                        else if(tokens[0].compareTo("e1")==0 && (board2.get(tokens[0])).compareTo("wK")==0&& tokens[1].compareTo("g1")==0) {
							board2.replace("f1", board2.get("h1"));
							board2.replace("h1","  ");
							}
							else if(tokens[0].compareTo("e1")==0 &&(board2.get(tokens[0])).compareTo("wK")==0 && tokens[1].compareTo("c1")==0) {
								board2.replace("d1", board2.get("a1"));
								board2.replace("a1","##");
							}
							
							else if(tokens[0].compareTo("e8")==0 &&(board2.get(tokens[0])).compareTo("bK")==0&&tokens[1].compareTo("g8")==0) {
								board2.replace("f8", board2.get("h8"));
								board2.replace("h8","##");
							}
							else if(tokens[0].compareTo("e8")==0 &&(board2.get(tokens[0])).compareTo("bK")==0&&tokens[1].compareTo("c8")==0) {
								board2.replace("d8", board2.get("a8"));
								board2.replace("a8","  ");
							}
							board2.replace(tokens[1], board2.get(tokens[0]));	
						}
						String row=tokens[0].charAt(0)+"";
						String col=tokens[0].charAt(1)+"";
						int number=Integer.parseInt(col);
						if(row.compareTo("a")==0 || row.compareTo("c")==0 || row.compareTo("e")==0|| row.compareTo("g")==0) {
							if(number%2==1) {
							board2.replace(tokens[0], "##");
							}
							else {
								board2.replace(tokens[0], "  ");
							}
						}
						else if (row.compareTo("b")==0 || row.compareTo("d")==0 || row.compareTo("f")==0|| row.compareTo("h")==0){
							if(number%2==1) {
								board2.replace(tokens[0], "  ");
								}
								else {
									board2.replace(tokens[0], "##");
								}
						}
						ArrayList<String> alter2 =sort(board2);
						System.out.println();
						draw(alter2);	
						String result=iterate(final1, board2);
						if(result.compareTo("Checkmate")==0) {
							if(count%2==1) {
								System.out.println("White wins");
							}
							else {
								System.out.println("Black wins");
							}
							break;
						}
					count++;
					System.out.println();
				}
		}
		}
		if(count==-1) {
			if(draw.compareTo("Black")==0) {
				System.out.print("Black's move: ");
				String input=x.nextLine();
				while(input.compareTo("draw")!=0) {
					System.out.print("Black's move: ");
					 input=x.nextLine();
				}
			}
			else if(draw.compareTo("White")==0) {
				System.out.print("White's move: ");
				String input=x.nextLine();
				while(input.compareTo("draw")!=0) {
					System.out.print("White's move: ");
					input=x.nextLine();
				}
			}
		}
	}

}
