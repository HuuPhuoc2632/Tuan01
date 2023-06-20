/**
 * 
 */
/**
 * @author HuuPhuoc
 *
 */
module ActiveMQDemo {

	requires java.xml.bind;
	requires java.naming;
	requires activemq.all;

	opens data to java.xml.bind;
}
