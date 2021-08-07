/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Chamidi wijesuriya. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

package lk.quiz.ijse.modal;

/**
 *
 * @author <chamidiwijesuriya@gmail.com> Chamidi
 */
public class item {
    private int code;
    private String name;
    private int price;

    public item(int code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public item() {
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
