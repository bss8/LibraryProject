/*
 * Copyright (c) 2020. SimplyATX.com
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.txstate.library.controllers;

import com.google.gson.Gson;
import edu.txstate.library.model.Item;
import edu.txstate.library.model.Library;
import edu.txstate.library.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.logging.Logger;

@RestController
public class LibraryController {
    Logger logger = Logger.getLogger(LibraryController.class.getName());
    @Value("${TARGET:World}")
    String message;

    @GetMapping("/hello")
    String hello() {
        return "CS4398/5394 Library App says hello!" + message + "!";
    }

    @GetMapping("getUserData")
    String getUserData() {
        logger.info("Getting user data.....");
        ArrayList<User> users = Library.getListOfUsers();
        return new Gson().toJson(users);
    }

    @GetMapping("getItemData")
    String getItemData() {
        logger.info("Getting inventory data.....");
        ArrayList<Item> inventory = Library.getInventory();
        return new Gson().toJson(inventory);
    }
}
