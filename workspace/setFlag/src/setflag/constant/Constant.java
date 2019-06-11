package setflag.constant;

import setflag.utils.UUIDUtils;

public interface Constant {
	
	String USER_BOY_AVATAR = "user_avatar/pretermit/boy_avatar.jpg";
	String USER_GILR_AVATAR = "user_avatar/pretermit/girl_avatar.jpg";
	String SYS_ARTICLE_IMAGE = "daily_punch_image/sys_article_image/sys_article_00"+UUIDUtils.getRandom()+".jpg";
	String IMAGE_BASE_ADRESS = "http://129.211.8.158:8080/setFlag/";
//	String IMAGE_BASE_ADRESS = "http://192.168.1.103:8080/setFlag/";
	
}
