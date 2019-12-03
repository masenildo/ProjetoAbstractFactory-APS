import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelaProjetoTest {

	@Test
	void CriarTela() {
		TelaProjeto tp = new TelaProjeto();
		tp.setFabrica(new FabricaWindows());
		tp.montar();
		assertEquals("Janela Windows(MenuWindows, BotãoWindows)", tp.desenhar());
	}

}
