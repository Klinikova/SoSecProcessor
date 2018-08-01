// The purpose of this class is to model a television
// Your name and today’s date

/**
 *
 * @author PolinaYoga
 */
public class Television {
    // CONSTRUCTORS
    public Television(String manufacturer, int screenSize)
    {
        MANUFACTURER = manufacturer;
        SCREEN_SIZE = screenSize;
        powerOn = false;
        channel = 2;
        volume = 20;
    }
    
    // FIELDS
    // maker of TV
    private final String MANUFACTURER;
    // diagonal size of screen
    private final int SCREEN_SIZE;
    // is TV on? (true/false)
    private boolean powerOn;
    // current channel
    private int channel;
    // current volume
    private int volume;
    
    // METHODS
    /**
     * getVolume method returns the value of the corresponding field. 
     * @return volume
     */  
    public int getVolume()
    {
        return volume;
    }
    
    /**
     * getChannel method returns the value of the corresponding field. 
     * @return channel
     */
    public int getChannel()
    {
        return channel;
    }
    
    /**
     * detManufacturer method returns the value of the corresponding field. 
     * @return MANUFACTURER
     */
    public String getManufacturer()
    {
        return MANUFACTURER;
    }
    
    /**
     * getScreenSize method returns the value of the corresponding field. 
     * @return SCREEN_SIZE
     */
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }
    
    /**
     * setChannel method accepts a value to be stored in the channel field. 
     * @param chnl The value to store in channel
     */
    public void setChannel(int chnl)
    {
        channel = chnl;
    }
    
    /**
     * power method changes the state from true to false or from false to true
     * @param !powerOn is false, then powerOn is true and vice versa. 
     */
    public void power()
    {
        powerOn = !powerOn;
    }
    
    /**
     * increaseVolume method increases the volume by 1
     */
    public void increaseVolume()
    {
        volume += 1;
    }
    
    /**
     * decreaseVolume method decreases the volume by 1
     */
    public void decreaseVolume()
    {
        volume -= 1;
    }
}
