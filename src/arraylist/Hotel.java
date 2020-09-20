package arraylist;

public class Hotel {
    private Room[][] rooms;
 //盖楼
    //
    public Hotel() {
      rooms = new Room[3][10];
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length ; j++) {
                if (i==0){
                    rooms[i][j]=new Room((i+1)*100+j+1,"单人间",true);
                }
               if (i==1){
                   rooms[i][j]=new Room((i+1)*100+j+1,"双人间",true);
               }
               if (i==2){
                   rooms[i][j]=new Room((i+1)*100+j+1,"总统间",true);
               }
            }

        }

    }
    public  void Print(){
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length ; j++) {
                 Room room=  rooms[i][j];
                System.out.println(room);

                  }
               }
            }
    //订房方法
    public void  order(int roomNo){
     Room room= rooms[roomNo/100-1][roomNo%100-1];
       room.setStatus(false);
        System.out.println(roomNo+"订房成功");
    }
    //退房方法
    public void exit(int roomNo){
        Room room= rooms[roomNo/100-1][roomNo%100-1];
        room.setStatus(true);
        System.out.println(roomNo+"退房成功");
    }

}
