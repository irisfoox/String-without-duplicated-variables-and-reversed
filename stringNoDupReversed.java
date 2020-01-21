package second;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="ddgglsssaklt";
        char[] str1=str.toCharArray();  // casting to char array
        int count=0;
        int a=0;
        for(int j=0;j<str.length();j++) {
        for(int i=0;i<str1.length;i++) {
          	if((str.charAt(j)==str1[i])){
        		count++;
        		a=i;
             	}
          		    //no duplicates in char array
        }
        if(count>1) {str1[a]=0;}
        count=0;
        }
	
        str="";
        for(int i=str1.length-1;i>=0;i--) {
        	if(Character.isLetter(str1[i])) {//only single letters in char array in reverse  
        		str+=str1[i];
        	}
        }
        System.out.println(str);
	}

}
