public class Boite<T> {
 private T contenu;


 public Boite(T contenu) {
 this.contenu = contenu;
 }


 public T getContenu() {
 return contenu;
 }

 
 public void setContenu(T contenu) {
 this.contenu = contenu;
 }




public static void main(String[] arg){
    // Utilisation
    Boite<String> boiteTexte = new Boite<>("Hello");
    Boite<Integer> boiteNombre = new Boite<>(42); 

    System.out.println(boiteTexte.getContenu());
    boiteTexte.setContenu("blyaaaaaaaaaaat");
    System.out.println(boiteTexte.getContenu());

    System.out.println(boiteNombre.getContenu());
    boiteNombre.setContenu(22);
    System.out.println(boiteNombre.getContenu());


}
}

