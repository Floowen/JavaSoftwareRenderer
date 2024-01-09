package main;

import java.util.Arrays;

public class Bitmap {
	/* Width of the image in pixels */
	private final int m_width;
	/* Height of the image in pixels */
	private final int m_height;
	/* Every pixel component in the image */
	private final byte m_components[];
	
	//Creates and initializes a bitmap
	public Bitmap(int width, int height) {
		m_width = width;
		m_height = height;
		m_components = new byte[m_width * m_height * 4];
	}
	
	//Set every pixel in the bitmap to a specific shade of grey
	public void clear(byte shade) {
		Arrays.fill(m_components, shade);
	}
	
	//Sets the pixel at (x,y) to the color specified by (a, b, g, r)
	public void drawPixel(int x, int y, byte a, byte b, byte g, byte r) {
		int index = (x + y * m_width) * 4;
		m_components[index] = a;
		m_components[index + 1] = b;
		m_components[index + 2] = g;
		m_components[index + 3] = r;
	}

	public void copyToByteArray(byte[] dest) {
		for	(int i = 0; i < m_width * m_height; i++) {
			dest[i * 3] = m_components[i * 4 + 1];
			dest[i * 3 + 1] = m_components[i * 4 + 2];
			dest[i * 3 + 2] = m_components[i * 4 + 3];
		}
	}

	public int getWidth() {
		return m_width;
	}

	public int getHeight() {
		return m_height;
	}
	
}
