package ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import ui.pages.ConferenceRoomsPage;
import ui.pages.OutOfOrderPlanningPage;
import ui.pages.ResourceAssociationsPage;
import ui.pages.RoomInfoPage;

/**
 * Created with IntelliJ IDEA.
 * User: DamianVillanueva
 * Date: 12/7/15
 * Time: 8:16 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class BasePageConferenceRoom extends BasePageObject{
    @FindBy(xpath = "//a[@ng-repeat='menuItem in breadcrumbMenu' and contains(text(),'Room Info')]")
    @CacheLookup
    WebElement tabRoomInfo;

    @FindBy(xpath = "//a[@ng-repeat='menuItem in breadcrumbMenu' and contains(text(),'Resource Associations')]")
    @CacheLookup
    WebElement tabResourceAssociations;

    @FindBy(xpath = "//a[@ng-repeat='menuItem in breadcrumbMenu' and contains(text(),'Out of Order Planning')]")
    @CacheLookup
    WebElement tabOutOfOrderPlanning;

    @FindBy(xpath = "//button[@ng-click='save()']")
    @CacheLookup
    WebElement  buttonSave;

    @FindBy(xpath = "//button[@ng-click='cancel()']")
    @CacheLookup
    WebElement buttonCancel;


    protected ConferenceRoomsPage clickSaveButton(){
        buttonSave.click();
        return new ConferenceRoomsPage();
    }

    protected ConferenceRoomsPage clickCancelButton(){
        buttonCancel.click();
        return new ConferenceRoomsPage();
    }

    protected RoomInfoPage clickRoomInfoTab(){
        tabRoomInfo.click();
        return new RoomInfoPage();
    }

    protected ResourceAssociationsPage clickResourceAssociationsTab(){
        tabResourceAssociations.click();
        return new ResourceAssociationsPage();
    }

    protected OutOfOrderPlanningPage clickOutOfOrderPlanningTab(){
        tabOutOfOrderPlanning.click();
        return new OutOfOrderPlanningPage();
    }
}
