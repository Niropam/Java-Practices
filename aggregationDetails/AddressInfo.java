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

class AddressInfo
{
   String city;
   String state;
   String country;
   int postCode;
   AddressInfo(String cty, String sta, String cntr,int pc)
   {
       this.city =cty;
       this.state = sta;
       this.country = cntr;
       this.postCode=pc;
   }
}

   