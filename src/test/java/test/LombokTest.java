package test;

import com.github.javafaker.Faker;
import models.Milestone;
import models.Project;
import models.TestCase;
import models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.Random;

public class LombokTest {
    Project firstProject = new Project();
    Project secondProject = new Project();
    User firstUser = new User();
    User secondUser = new User();
    Faker faker = new Faker();
    Random random = new Random();
    Date startDate = new Date(124, 7, 1, 12, 0, 0);
    Date engDate = new Date(124, 7, 31, 12, 0, 0);
    private Logger logger = LogManager.getLogger(LombokTest.class);

    @Test
    public void egualsProjectsTest() {
        firstProject.setProjectName(faker.name().name());
        firstProject.setAnnouncement(faker.company().name());
        firstProject.setShowAnnouncement(random.nextBoolean());
        firstProject.setProjectType(random.nextInt(3));
        firstProject.setEnableApprovals(random.nextBoolean());

        secondProject.setProjectName(faker.name().name());
        secondProject.setAnnouncement(faker.company().name());
        secondProject.setShowAnnouncement(random.nextBoolean());
        secondProject.setProjectType(random.nextInt(3));
        secondProject.setEnableApprovals(random.nextBoolean());

        logger.info(firstProject.toString());
        logger.info(secondProject.toString());
        Assert.assertNotEquals(firstProject, secondProject);
    }

    @Test
    public void builderTest() {
        TestCase firstTestCase = TestCase.builder()
                .title(faker.company().industry())
                .section("Test Cases")
                .template("Test Case (Text)")
                .type("Acceptance")
                .priority("Medium")
                .assignedTo("Me")
                .estimate(faker.pokemon().name())
                .references(faker.company().name())
                .automationType("None")
                .preconditions(faker.color().hex())
                .steps(faker.company().profession())
                .expectedResult(faker.job().position())
                .build();

        TestCase secondTestCase = TestCase.builder()
                .title(faker.company().industry())
                .section("Test Cases")
                .template("Test Case (Text)")
                .type("Acceptance")
                .priority("Critical")
                .assignedTo("Me")
                .estimate(faker.pokemon().name())
                .references(faker.company().name())
                .automationType("None")
                .preconditions(faker.color().hex())
                .steps(faker.company().profession())
                .expectedResult(faker.job().position())
                .build();
        logger.info(firstTestCase);
        logger.info(secondTestCase);
        Assert.assertNotEquals(secondTestCase, firstTestCase);
    }

    @Test
    public void milestoneTest() {
        Milestone firstMilestone = Milestone.builder()
                .id(random.nextInt(11))
                .name(faker.animal().name())
                .references(faker.company().name())
                .parent(faker.name().fullName())
                .description(faker.address().city())
                .startDate(startDate)
                .endDate(engDate)
                .isMilestoneIsCompleted(random.nextBoolean())
                .build();

        Milestone secondMilestone = Milestone.builder()
                .id(random.nextInt(11))
                .name(faker.animal().name())
                .references(faker.company().name())
                .parent(faker.name().fullName())
                .description(faker.address().city())
                .startDate(startDate)
                .endDate(engDate)
                .isMilestoneIsCompleted(random.nextBoolean())
                .build();
        logger.info(firstMilestone);
        logger.info(firstMilestone);
        Assert.assertNotEquals(secondMilestone, firstMilestone);
    }
@Test
    public void userTest() {
        firstUser.setUsername(faker.funnyName().name());
        firstUser.setPassword(faker.code().asin());
        secondUser.setUsername(faker.name().username());
        secondUser.setPassword(faker.code().imei());

        logger.info(firstUser);
        logger.info(secondUser);
        Assert.assertNotEquals(firstUser,secondUser);
    }
}
