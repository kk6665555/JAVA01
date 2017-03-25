package tw.org.iii;

public class TWid {
	private String id; //封裝
	static String letters="ABCDEFGHJKLMNPQRSTUVXYWZIO";//必須加上static
//	TWid(String myid){
//		id = myid;
//	}
	TWid(){
		this((int)(Math.random()*2)==0);
	}
	TWid(boolean isFemale){
		this(isFemale,(int)(Math.random()*26));
	}
	TWid(int area){
		this((int)(Math.random()*2)==0,area);
	}
	TWid(boolean isFemale, int area){
		//super();
		char f0 = letters.charAt(area);
		char f1 = isFemale?'2':'1';
		StringBuffer sb = new StringBuffer( "" + f0 + f1);
	//	String temp = "" + f0 + f1;
		for(int i = 0;i<7;i++){
			sb.append((int)(Math.random()*10));
			//temp+=(int)(Math.random()*10);
		}
		for(int i = 0;i<10;i++){
				if(isCheck(sb.toString() + i)){
					//id=temp+i;
					id = sb.append(i).toString();
					break;
				}
		}
		
	}

	TWid(String id){
		this.id = id;
	}
	
	boolean Resume(){
		char gender = id.charAt(1);
		return gender=='2';
	}
	String getid(){
		return id;
	}
	static boolean isCheck(String id){
		if (!id.matches("^[A-Z][12][0-9]{8}")) return false;
		char f0 = id.charAt(0);
		int n12 = letters.indexOf(f0)+10;//第一碼
		int n1 = n12/10;
		int n2 = n12%10;
		int n3 = Integer.parseInt(id.substring(1,2));
		int n4 = Integer.parseInt(id.substring(2,3));
		int n5 = Integer.parseInt(id.substring(3,4));
		int n6 = Integer.parseInt(id.substring(4,5));
		int n7 = Integer.parseInt(id.substring(5,6));
		int n8 = Integer.parseInt(id.substring(6,7));
		int n9 = Integer.parseInt(id.substring(7,8));
		int n10 = Integer.parseInt(id.substring(8,9));
		int n11= Integer.parseInt(id.substring(9,10));
		int sum = n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1;
		
		return sum%10==0;
		}
	}
	
//	static boolean precheck(String id){
//		if (id.length()==10){
//			if(letters.indexOf(id.charAt(0))==-1){
//				if (id.charAt(1)==31 &&id.charAt(1)==32){
//					
//				}
//			}
//		}
//		return true;
//	}

