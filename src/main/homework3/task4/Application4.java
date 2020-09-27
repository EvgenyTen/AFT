package main.homework3.task4;

public class Application4 {
    public static void main(String[]  args){
     Human sergey=new Human("Sergey");
     Human valeriy=new Human("Valeriy");
     Human stanislav=new Human("Stanislav");
     Human mihail=new Human("Mihail");
     Human aleksandr=new Human("Aleksandr");
     Human egor=new Human("Egor");
     Human grigoriy=new Human("Grigoriy");


        sergey.addFriend(valeriy);
        sergey.addFriend(grigoriy);
        valeriy.addFriend(stanislav);
        stanislav.addFriend(mihail);
        mihail.addFriend(aleksandr);
        aleksandr.addFriend(grigoriy);
        aleksandr.addFriend(mihail);
        egor.addFriend(grigoriy);

       // static boolean areFriends(Human first,Human second) {
        //    for (Human firstFriend : first.friends)
       //         if (firstFriend == second) return true;
      //      return false;
       // }
       // System.out.println(areFriends(sergey, grigoriy));
      //  System.out.println(areFriends(sergey, aleksandr));
      //  System.out.println(areFriends(stanislav, mihail));
      //  System.out.println(areFriends(mihail, valeriy));
    }
}
