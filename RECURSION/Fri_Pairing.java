
    package RECURSION;

    public class Fri_Pairing {
        public static int pairing(int n)
        {
            if(n==1 || n==2)
            {
                return n;
            }
//            int fnm1=pairing(n-1);
//            int fnm2=pairing(n-2);
//            int pairways=(n-1)*fnm2;
//            int totalPairways=fnm1+pairways;

            return pairing(n-1)+(n-1)*pairing(n-2);

        }
        public static void main(String[] args) {
            System.out.println(pairing(4));
        }

    }
