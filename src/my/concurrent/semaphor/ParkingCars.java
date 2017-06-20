package my.concurrent.semaphor;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.Semaphore;  
  
public class ParkingCars {  
  
     private static final int NUMBER_OF_CARS = 30;  
  
     private static final int NUMBER_OF_PARKING_SLOT = 10;  
  
     public static void main(String[] args) {  
  
          /* 
          * ����FIFO, ����true 
          */  
          Semaphore parkingSlot = new Semaphore(NUMBER_OF_PARKING_SLOT, true);  
  
          ExecutorService service = Executors.newCachedThreadPool();  
  
          for (int carNo = 1; carNo <= NUMBER_OF_CARS; carNo++) {  
               service.execute(new Car(parkingSlot, carNo));  
          }  
  
          sleep(3000);  
  
          service.shutdown();  
  
          /* 
          * ������м��������õ���Դ�� 
          */  
          System.out.println(parkingSlot.availablePermits() + " ��ͣ��λ������!");  
     }  
  
     private static void sleep(long millis) {  
          try {  
               Thread.sleep(millis);  
          } catch (InterruptedException e) {  
               // TODO Auto-generated catch block  
               e.printStackTrace();  
          }  
     }  
  
}  