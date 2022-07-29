// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int a=100;
        List<Integer> l=new ArrayList<>();
        List<Integer> m=new ArrayList<>();
        l.add(101);
        l.add(100);
        l.add(524);
        m.add(100);
        m.add(1);
        m.add(20);
        boolean f=true;
        int ans=0;
        while(f){
            int j=0;
            int cnt=0;
            for(Integer i :l){
                if(i<=a){
                    a+=m.get(j);
                    System.out.println(l.remove(j));
                    System.out.println(m.remove(j));
                    ans++;
                    cnt=1;
                    break;
                }
                j++;
            }
            if(cnt==0){
                f=false;
            }
        }  
        System.out.println(ans);
    }
}
