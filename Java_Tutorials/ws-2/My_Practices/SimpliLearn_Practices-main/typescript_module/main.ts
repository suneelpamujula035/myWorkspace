import { dis1, display } from "./abc";
import { dis2,display as disInfo } from "./xyz";//If two functons have same name then we use alias 
dis1();
dis2();
display();
disInfo();//we should to provide alias name