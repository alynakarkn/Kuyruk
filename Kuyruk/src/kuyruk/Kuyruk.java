/*
SORUM :
100 elemanlı bir tamsayı dizisi kullanarak bir kuyruk programı yazınız. Kuyruk ilk giren ilk çıkar prensibine göre çalışır. Programda aşağıdaki metodlar olsun:
-	sayiEkle(int sayi): verilen sayiyi kuyruğa ekler
-	sayiAl(): kuyruğun en başındaki elemanı verir ve kuyruktan çıkarır
-	sayiSil(int index): verilen indexteki sayıyı (varsa) siler ve solundaki elemanları sağa doğru kaydırarak boşluğu kapatır.
-	bosmu(): Kuyruk boşsa true, değilse false döndürür.
-	dolumu():Kuyruk doluysa true, değilse false döndürür.

Kuyruğu öncelikle 0 ile doldurup, silinen elemanların yerine 0 yazabilirsiniz. Kuyruğa girecek sayılar da sıfırdan büyük olmalıdır. 

 */
package kuyruk;
public class Kuyruk {
     int[] dizi;
     int son;
    private int sayi;
     public Kuyruk() {
         son=-1;
         dizi= new int [3];        
     }
     public void sayiEkle (int sayi) {
         if(son==dizi.length-1) {
             System.out.println("Kuyruk dolu");
         }
         else{
             dizi[++son]=sayi;
         }
     }
     public int sayiAl() throws Exception {
         if(son==-1) {
             System.out.println("Kuyruk Boş");
             throw new Exception();
         }
         else {
             int sayi=dizi[0];
             for(int i=0;i<son;i++);
         }
         dizi[son]=0;
         son--;         
          return sayi;   
         } 
     
     public void sayıSil (int index) {
     if(index<=son) {
         for(int i=index; i<son;i++){
             dizi[i]=dizi[i+1];
         }
         dizi[son]=0;
         son--; 
         }
     else {
             System.out.println(index+". eleman yok");
     } 
     }
     public void kuyrukYazdir() {
         for(int i=dizi.length-1;i>=0;i--) {
             System.out.println(dizi[i]+" ");
         }
         System.out.println("");
         }
         public boolean bosmu() {
             return son==-1;
     }
         public boolean dolumu() {
             return son==dizi.length;
}
     

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
