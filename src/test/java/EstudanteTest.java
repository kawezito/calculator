import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.teste_junit.classes.Estudante;

public class EstudanteTest {
  Estudante estudante;

  @BeforeAll
  static void setup() {
    System.out.println("Iniciando testes!");
  }

  @BeforeEach
  public void inicializadorDeEstudante() {
    estudante = new Estudante();
  }

  @Test
  public void verificaSeONomeDoEstudanteENulo() {
    estudante.setNome("Kawê");

    assertEquals("Kawê", estudante.getNome());
    // Valor esperado: "Kawê
    // Valor dado: null
    // Por isso deu erro
  }

  @Test
  public void verificarSeOEstudanteTemMediaMaiorQue6() {
    estudante.setNota1(6);
    estudante.setNota2(8);
    estudante.setNota3(6);
    estudante.setNota3(4);

    double media = estudante.calcularMedia(
        estudante.getNota1(),
        estudante.getNota2(),
        estudante.getNota3(),
        estudante.getNota4());

    System.out.println(media);
    assertTrue(media < 6);
  }
}
