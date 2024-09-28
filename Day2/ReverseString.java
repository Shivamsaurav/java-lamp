package Day2;
public class ReverseString {
    public static void main(String[] args) {
        
        String str = "GeeksforGeeks", nstr="";
        String str2 = "GeeksforGeeks";
        String str3 = new String("GeeksforGeeks");
        char ch;

        System.out.println(str == str2); // true, because str & str2 two diff stack mem's ref variable points to same heap mem. 
        System.out.println(str == str3); // false, because str & str3 two diff ref variable points to diff heap mem. as new is used for str3.
        System.out.println(str2 == str3); // false, because str2 & str3 two diff ref variable points to diff heap mem. as new is used for str3.
        
        // using loop
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println("String reversed "+nstr);
    }
}
