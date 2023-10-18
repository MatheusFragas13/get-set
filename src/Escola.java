public class Escola {
    public static void main(String[] args){
        Alunos felipe = new Alunos();
        felipe.setNome("Felipe");
        felipe.setIdade(50);
        felipe.setMedia(50);
        

        System.out.println("    " + felipe.getNome() + "  " + felipe.getIdade() + "  " + felipe.getMedia());
    }
}
