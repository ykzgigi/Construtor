package Atividade11_09;

public class ConstrutorConsulta {
	public class Consunta {

		public static void main(String[] args) {

			Consulta consulta = new Consulta ("gigi");

			Consulta consulta2 = new Consulta ("Ana");

			Consulta consulta3 = new Consulta (30);
			
			

			System.out.println(consulta.getNomePaciente());

			System.out.println(consulta.getData());

			System.out.println(consulta2.getNomeDentista());

			System.out.println(consulta3.getData());

		}

	}
}

