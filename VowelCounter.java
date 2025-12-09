import java.util.Scanner;

 class VowelCounter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String word=sc.nextLine();
         int count=0;
         for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    count++;
                }
             }
             System.out.println("number of vowels in string:" + count);
             sc.close();
    }
}
