/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelender;

/**
 *
 * @author Dewi Roaza
 */
public class Transport {
    private String idTransport;
    private String nameTransport;
    private Float averageVelocity;

    /**
     * @return the idTransport
     */
    public String getIdTransport() {
        return idTransport;
    }

    /**
     * @param idTransport the idTransport to set
     */
    public void setIdTransport(String idTransport) {
        this.idTransport = idTransport;
    }

    /**
     * @return the nameTransport
     */
    public String getNameTransport() {
        return nameTransport;
    }

    /**
     * @param nameTransport the nameTransport to set
     */
    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    /**
     * @return the averageVelocity
     */
    public Float getAverageVelocity() {
        return averageVelocity;
    }

    /**
     * @param averageVelocity the averageVelocity to set
     */
    public void setAverageVelocity(Float averageVelocity) {
        this.averageVelocity = averageVelocity;
    }
}
