import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
//        System.out.println();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcus = new Dev();
        devMarcus.setNome("Marcus");
        devMarcus.inscreverBootcamp(bootcamp);
        System.out.println("\uD83D\uDC68\u200D\uD83D\uDCBB Desenvolvedor: " + devMarcus.getNome());
        System.out.println("📅 Data de inscrição : " + LocalDate.now().format(formatter));
        System.out.println("-------------------------------------------");
        System.out.println("\uD83D\uDCDA Conteúdos inscritos: ");
        if(devMarcus.getConteudosInscritos().isEmpty()){
            System.out.println("Nenhum conteúdo inscrito.");
        }else {
            devMarcus.getConteudosInscritos()
                    .forEach(c -> System.out.println(" -" + c.getTitulo()));
        }

        System.out.println("\n✅ Conteúdos concluidos: ");
        if (devMarcus.getConteudosConcluidos().isEmpty()){
            System.out.println("Nenhum conteúdo concluido.");
        }else {
            devMarcus.getConteudosConcluidos()
                    .forEach(c -> System.out.println(c.getTitulo()));
        }
        System.out.println("XP: " + devMarcus.calcularTotalXp());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("=================================");
        System.out.println("\uD83D\uDC68\u200D\uD83D\uDCBB Desenvolvedor: " + devJessica.getNome());
        System.out.println("📅 Data de inscrição : " + LocalDate.now().format(formatter));
        System.out.println("---------------------------------------");
        System.out.println("\uD83D\uDCDA Conteúdos inscritos: ");
        if(devJessica.getConteudosInscritos().isEmpty()){
            System.out.println("Nenhum conteúdo inscrito.");
        }else {
            devJessica.getConteudosInscritos()
                    .forEach(c -> System.out.println(" -" + c.getTitulo()));
        }

        devJessica.progredir();
        devJessica.progredir();
        devJessica.progredir();

        System.out.println("\n✅ Conteudos Concluidos: ");
        if (devJessica.getConteudosConcluidos().isEmpty()) {
            System.out.println(" Nenhum conteúdo concluido!");
        }else {
            devJessica.getConteudosConcluidos()
                    .forEach(c -> System.out.println(" -" + c.getTitulo()));
        }

        System.out.println("\n⭐ XP Total: " + devJessica.calcularTotalXp());
        System.out.println("==========================================\n");

    }
}