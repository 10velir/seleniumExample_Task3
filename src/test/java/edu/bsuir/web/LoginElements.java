package edu.bsuir.web;

import org.openqa.selenium.By;

public class LoginElements {
    public static final String URL = "http://testing.cld.iba.by/";
    public static final String URL1 = "http://testing.cld.iba.by/web/guest/recruiting";
    public static final String URL2 = "http://testing.cld.iba.by/web/guest/recruiting/applications/-/applications/createApplication";

    public static final By LOGIN = By.xpath("//input[@id='_58_login']");
    public static final By PASSWORD = By.xpath("//input[@id='_58_password']");
    public static final By LOGIN_BUTTON = By.xpath("//div[@class = 'button-holder ']//button");

    public static final By USERNAME = By.xpath("//div[@class = 'float-box']//div//h3");

    public static final By CELL = By.xpath("//a[@href = 'http://testing.cld.iba.by/web/guest/recruiting']");
    public static final By FLOATBOX = By.xpath("//div[@class = 'float-box']//div//h3");
    public static final By REQUEST = By.xpath("//*[@id=\"addRequest\"]/div[2]/div[2]/a");

    public static final By POSITION = By.xpath("//*[@id=\"name\"]");
    public static final By PLANNED_CLOSING_DATE = By.xpath("//*[@id=\"plannedClosingDate\"]");
    public static final By PRIORITY_RADIO_BTN = By.xpath("//*[@value = '2']");
    public static final By QUANTITY = By.xpath("//*[@id=\"quantity\"]");
    public static final By CREATION_REASON = By.xpath("//*[@id=\"creationReason\"]");
    public static final By CURRENCY = By.xpath("//*[@id = 'currency']");
    public static final By JOB_TYPE = By.xpath("//*[@id = 'jobType']");
    public static final By TYPE = By.xpath("//*[@id=\"contractType-2\"]");
    public static final By SALARY = By.xpath("//*[@id=\"salary\"]");
    public static final By EMPLOYEES = By.xpath("//*[@id=\"employees\"]");
    public static final By BUSINESS_TRIP = By.xpath("//*[@id=\"businessTrip\"]");
    public static final By TIMETABLE = By.xpath("//*[@id=\"timetable\"]");
    public static final By PROBATION_PERIOD = By.xpath("//*[@id=\"probationPeriod\"]");
    public static final By RESPONSIBILITIES = By.xpath("//*[@id=\"responsibilities\"]");
    public static final By CANDIDATE_TYPE = By.xpath("//*[@id=\"candidateTypeInternal\"]");
    public static final By EDUCATION = By.xpath("//*[@id = 'education']");
    public static final By EDUCATION_SPECIALIZATION = By.xpath("//*[@id='educationSpecialization']");
    public static final By PRIORITY_WORKING_EXPERIENCE = By.xpath("//*[@id=\"priority.working.experience\"]");
    public static final By UNDESIRABLE_WORKING_EXPERIENCE = By.xpath("//*[@id=\"undesirableWorkingExperience\"]");
    public static final By COMMENT = By.xpath("//*[@id=\"comment\"]");
    public static final By SAVE_BTN = By.xpath("//*[@id=\"save\"]");

    public static final By EDIT_APPLICATION = By.xpath("//*[@id = 'editApplicationButton']");
    public static final By SEND_TO_APPROVAL_BUTTON = By.xpath("//div//a[@id = 'sendToApprovalButton']");
    public static final By SELECT_SKILLS = By.xpath("//*[@id = 'editrequiredCompetence']");
    public static final By SELECT_BASE_SKILLS = By.xpath("//span[text()='Базовые']");
    public static final By CONFIRM_BUTTON = By.xpath("//button[text() = 'OK']");
    public static final By TRAINABILITY = By.xpath("//span[text() = 'Обучаемость']");
    public static final By STRESS_RESISTANCE = By.xpath("//span[text() = 'Стрессоустойчивость']");
    public static final By BASE_WEB = By.xpath("//span[text() = 'Базовые web технологии']");
    public static final By JS = By.xpath("//span[text() = 'JavaScript']");
    public static final By CSS3 = By.xpath("//span[text() = 'CSS3']");
    public static final By HTML = By.xpath("//span[text() = 'HTML']");

    public static By getLoginButton(String name){
        return By.xpath("//button[text()" + " ']");
    }
}