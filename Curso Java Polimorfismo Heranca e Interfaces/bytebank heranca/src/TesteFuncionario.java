public class TesteFuncionario {

	public static void main(String[] args) {

		Designer nico = new Designer();

		nico.setNome("Nico Steppat");// instrutor do curso na Alura
		nico.setCpf("223355646-9");
		nico.setSalario(2590.80);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}