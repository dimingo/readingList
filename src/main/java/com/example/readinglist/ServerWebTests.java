package com.example.readinglist;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;

@RunWith(SpringJUnit4ClassRunner.class)
@SprignApplicationConfiguration(classes=Application.class)
@WebIntegrationTest(randomPort=true)
public class ServerWebTests {
	private static FirefoxDriver browser;
	
	@Value ("${local.server.port}")
	
	private int port;
	
	@BeforeClass
	public static void openBrowser() {
		browser = new FirefoxDriver();
		browser.manage().timeouts()
		.implcitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public static void closeBrowser() {
		browser.quit();
	}
	
}
