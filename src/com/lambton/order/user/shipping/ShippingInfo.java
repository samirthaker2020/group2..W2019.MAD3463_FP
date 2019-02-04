package com.lambton.order.user.shipping;



    import java.util.ArrayList;

    public class ShippingInfo {

        private int shippingId;
        private String shippingType;
        private int shippingCost;
        private int shippingRegionId;

        ArrayList<ShippingInfo> shipInfoList = new ArrayList<ShippingInfo>();

        public ShippingInfo() {

        }

        public ShippingInfo(int shippingId, String shippingType, int shippingCost, int shippingRegionId) {

            this.shippingId = shippingId;
            this.shippingType = shippingType;
            this.shippingCost = shippingCost;
            this.shippingRegionId = shippingRegionId;
        }

        public int getShippingId() {
            return shippingId;
        }

        public void setShippingId(int shippingId) {
            this.shippingId = shippingId;
        }

        public String getShippingType() {
            return shippingType;
        }

        public void setShippingType(String shippingType) {
            this.shippingType = shippingType;
        }

        public int getShippingCost() {
            return shippingCost;
        }

        public void setShippingCost(int shippingCost) {
            this.shippingCost = shippingCost;
        }

        public int getShippingRegionId() {
            return shippingRegionId;
        }

        public void setShippingRegionId(int shippingRegionId) {
            this.shippingRegionId = shippingRegionId;
        }

        public ArrayList<ShippingInfo> getShipInfoList() {
            return shipInfoList;
        }

        public void setShipInfoList(ArrayList<ShippingInfo> shipInfoList) {
            this.shipInfoList = shipInfoList;
        }

        public boolean updateShipping(ShippingInfo ship)
        {

            for(ShippingInfo shipInfo : shipInfoList)
            {
                if(shipInfo.getShippingId() == ship.getShippingId())
                {
                    shipInfo.setShippingType(ship.getShippingType());
                    shipInfo.setShippingCost(ship.getShippingCost());
                    shipInfo.setShippingRegionId(ship.getShippingRegionId());

                }
                else
                {
                    System.out.println("Shipping id not available");
                }
            }

            return true;
        }
    }


