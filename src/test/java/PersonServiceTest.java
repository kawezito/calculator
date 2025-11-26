import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.teste_junit.service.PersonService;

public class PersonServiceTest {
  // Red - Dá erro
  // @Test
  // void naoDevePermitirCriarPessoaMenorDeIdade() {
  //   PersonService personService = new PersonService();

  //   IllegalArgumentException exception = assertThrows(
  //       IllegalArgumentException.class,
  //       () -> personService.createPerson("Kawê", "12345678901", 16));

  //   assertEquals("Idade inválida: menor de 18 anos", exception.getMessage());
  // }

  // @Test
  // void naoDevePermitirCriarPessoaComCpfInvalido() {
  //   PersonService personService = new PersonService();

  //   IllegalArgumentException exception = assertThrows(
  //       IllegalArgumentException.class,
  //       () -> personService.createPerson("Kawê", "123", 20));

  //   assertEquals("Cpf inválido", exception.getMessage());
  // }
}
