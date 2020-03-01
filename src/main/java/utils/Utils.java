package utils;

import org.openqa.selenium.WebElement;

public class Utils {
	
	/**
	 * Espera o elemento estar visivel na tela e clica.
	 * 
	 * @param element
	 * @param timeout
	 * @throws InterruptedException
	 */
	public void click(WebElement element, int timeout) throws InterruptedException {
		int count = 0;
		while(count < timeout) {
			if(element.isDisplayed()) {
				element.click();
				break;
			}else {
					Thread.sleep(1000);
				}
				count++;
		}
	}
}
