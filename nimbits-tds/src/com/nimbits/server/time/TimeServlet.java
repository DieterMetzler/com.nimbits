package com.nimbits.server.time;

import com.nimbits.client.common.*;
import com.nimbits.client.enums.*;
import com.nimbits.server.gson.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

/**
 * Created by Benjamin Sautner
 * User: bsautner
 * Date: 3/20/12
 * Time: 9:14 AM
 */
public class TimeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        final PrintWriter out = resp.getWriter();
        DateFormatType type;
        String format = req.getParameter(Parameters.format.getText());
        if (Utils.isEmptyString(format)) {
            type = DateFormatType.unixEpoch;

        }
        else {
            type = DateFormatType.get(format);
        }
        if (type == null) {
            type = DateFormatType.unixEpoch;
        }
        switch (type) {

            case unixEpoch:
                out.print(new Date().getTime());
                break;
            case json:
                out.print(GsonFactory.getInstance().toJson(new Date()));
                break;
        }


    }
}
