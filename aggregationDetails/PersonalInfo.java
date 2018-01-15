/**
 * LICT-TUP-OFF-BDJ-21-ANDROID
 * Java Course Trainer: Md Ismail Rahman
 * Author: Niropam Das.... Email:niropam@outlook.com 
 * Program on displaying your (name,id) and address (city, district, post code,country) using aggregation.
 */
package aggregationDetails;

/**
 *
 * @author Niropam
 */

class PersonalInfo
{
   int id;
   String name;

   AddressInfo personAddr; 
   PersonalInfo(int nid, String pname, AddressInfo addr){
       this.id=nid;
       this.name=pname;
       this.personAddr = addr;
   }
}
