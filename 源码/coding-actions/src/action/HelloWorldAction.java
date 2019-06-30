package action;

import com.opensymphony.xwork2.ActionSupport;

import model.MessageStore;

public class HelloWorldAction extends ActionSupport {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Override
    public String execute()  {
	// TODO Auto-generated method stub
	helloCount ++;
	messageStore = new MessageStore();
	
	if (userName != null) {
	    messageStore.setMessage(messageStore.getMessage() + " 你好" + userName );
	}
	return SUCCESS;
    }

    private MessageStore messageStore;

    /**
     * @return the messageStore
     */
    public MessageStore getMessageStore() {
	return messageStore;
    }

    // 添加一个static int 变量
    private static int helloCount = 0;
    
    public int getHelloCount() {
	return helloCount;
    }
}
