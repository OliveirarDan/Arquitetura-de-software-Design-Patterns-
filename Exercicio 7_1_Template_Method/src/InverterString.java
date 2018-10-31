/**
 * @author Danilo Rodrigues Oliveira RA: 81612248
 */

public class InverterString extends StringQualquer {
	protected String transformarString(String string) {
		StringBuffer buffer = new StringBuffer(string.length());
		for (int i = string.length(); i > 0; i--)
			buffer.append(string.charAt(i - 1));
		return buffer.toString();
	}
}
