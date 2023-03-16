import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;


    public  ServiceStation(Queue<Transport> queue) {
        this.queue = queue;

    }

    public void addTransport(Transport auto){
        if (auto != null) {
            System.out.println("Введите автомобиль");
        }
        queue.offer(auto);
    }
    public  void  carryOutATechnicalInspection(Transport auto){
        for(Transport transport: queue){
            System.out.println("проходим ТО");
            queue.remove();
        }
    }


}