package designpatterns.singletonDP;

public class Test {
    public static void main(String[] args) {
      //  new Samosa();
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());
    }

    }

