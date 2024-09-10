package pages;



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {

    }

    public void clickLogin() {
        getLoginButton().click();
    }
