/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import service.CareerService;
import service.TrainningService;

/**
 *
 * @author OS
 */
@WebServlet(name = "MultiChoiceController", urlPatterns = {"/multichoice"})
public class MultiChoiceController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "TriThuc.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CareerService careerService = new CareerService();
        TrainningService trainningService = new TrainningService();
        Double g1 = 0.0, g2 = 0.0, g3 = 0.0, g4 = 0.0, g5 = 0.0, g6 = 0.0;
        Double f1 = 0.0, f2 = 0.0, f3 = 0.0, f4 = 0.0, f5 = 0.0, f6 = 0.0, f7 = 0.0, f8 = 0.0, f9 = 0.0, f10 = 0.0,
                f11 = 0.0, f12 = 0.0, f13 = 0.0, f14 = 0.0, f15 = 0.0, f16 = 0.0, f17 = 0.0, f18 = 0.0,
                f19 = 0.0, f20 = 0.0, f21 = 0.0, f22 = 0.0, f23 = 0.0, f24 = 0.0, f25 = 0.0, f26 = 0.0,
                f27 = 0.0, f28 = 0.0, f29 = 0.0, f30 = 0.0, f31 = 0.0, f32 = 0.0, f33 = 0.0, f34 = 0.0,
                f35 = 0.0, f36 = 0.0, f37 = 0.0, f38 = 0.0, f39 = 0.0, f40 = 0.0, f41 = 0.0, f42 = 0.0,
                f43 = 0.0, f44 = 0.0, f45 = 0.0, f46 = 0.0, f47 = 0.0, f48 = 0.0, f49 = 0.0, f50 = 0.0,
                f51 = 0.0, f52 = 0.0, f53 = 0.0, f54 = 0.0, f55 = 0.0, f56 = 0.0, f57 = 0.0, f58 = 0.0,
                f59 = 0.0, f60 = 0.0, f61 = 0.0, f62 = 0.0;
        List<Integer> notChooseQuestions = new ArrayList<>();

        String url = "";

        try {
            String s1 = request.getParameter("q1");
            Integer a1 = Integer.valueOf(request.getParameter("q1"));
            f1 = 0.0;
            if (a1 == 2) {
                f1 = 0.1;
            } else if (a1 == 3) {
                f1 = 0.35;
            } else if (a1 == 4) {
                f1 = 0.6;
            } else if (a1 == 5) {
                f1 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(1);
        }

        try {
            String s2 = request.getParameter("q2");
            Integer a2 = Integer.valueOf(request.getParameter("q2"));
            f2 = 0.0;
            if (a2 == 2) {
                f2 = 0.1;
            } else if (a2 == 3) {
                f2 = 0.35;
            } else if (a2 == 4) {
                f2 = 0.6;
            } else if (a2 == 5) {
                f2 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(2);
        }

        try {
            String s3 = request.getParameter("q3");
            Integer a3 = Integer.valueOf(request.getParameter("q3"));
            f3 = 0.0;
            if (a3 == 2) {
                f3 = 0.1;
            } else if (a3 == 3) {
                f3 = 0.35;
            } else if (a3 == 4) {
                f3 = 0.6;
            } else if (a3 == 5) {
                f3 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(3);
        }

        try {
            String s4 = request.getParameter("q4");
            Integer a4 = Integer.valueOf(request.getParameter("q4"));
            f4 = 0.0;
            if (a4 == 2) {
                f4 = 0.1;
            } else if (a4 == 3) {
                f4 = 0.35;
            } else if (a4 == 4) {
                f4 = 0.6;
            } else if (a4 == 5) {
                f4 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(4);
        }

        try {
            String s5 = request.getParameter("q5");
            Integer a5 = Integer.valueOf(request.getParameter("q5"));
            f5 = 0.0;
            if (a5 == 2) {
                f5 = 0.1;
            } else if (a5 == 3) {
                f5 = 0.35;
            } else if (a5 == 4) {
                f5 = 0.6;
            } else if (a5 == 5) {
                f5 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(5);
        }

        try {
            String s6 = request.getParameter("q6");
            Integer a6 = Integer.valueOf(request.getParameter("q6"));
            f6 = 0.0;
            if (a6 == 2) {
                f6 = 0.1;
            } else if (a6 == 3) {
                f6 = 0.35;
            } else if (a6 == 4) {
                f6 = 0.6;
            } else if (a6 == 5) {
                f6 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(6);
        }

        try {
            String s7 = request.getParameter("q7");
            Integer a7 = Integer.valueOf(request.getParameter("q7"));
            f7 = 0.0;
            if (a7 == 2) {
                f7 = 0.1;
            } else if (a7 == 3) {
                f7 = 0.35;
            } else if (a7 == 4) {
                f7 = 0.6;
            } else if (a7 == 5) {
                f7 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(7);
        }

        try {
            String s8 = request.getParameter("q8");
            Integer a8 = Integer.valueOf(request.getParameter("q8"));
            f8 = 0.0;
            if (a8 == 2) {
                f8 = 0.1;
            } else if (a8 == 3) {
                f8 = 0.35;
            } else if (a8 == 4) {
                f8 = 0.6;
            } else if (a8 == 5) {
                f8 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(8);
        }

        try {
            String s9 = request.getParameter("q9");
            Integer a9 = Integer.valueOf(request.getParameter("q9"));
            f9 = 0.0;
            if (a9 == 2) {
                f9 = 0.1;
            } else if (a9 == 3) {
                f9 = 0.35;
            } else if (a9 == 4) {
                f9 = 0.6;
            } else if (a9 == 5) {
                f9 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(9);
        }

        try {
            String s10 = request.getParameter("q10");
            Integer a10 = Integer.valueOf(request.getParameter("q10"));
            f10 = 0.0;
            if (a10 == 2) {
                f10 = 0.1;
            } else if (a10 == 3) {
                f10 = 0.35;
            } else if (a10 == 4) {
                f10 = 0.6;
            } else if (a10 == 5) {
                f10 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(10);
        }

        try {
            String s11 = request.getParameter("q11");
            Integer a11 = Integer.valueOf(request.getParameter("q11"));
            f11 = 0.0;
            if (a11 == 2) {
                f11 = 0.1;
            } else if (a11 == 3) {
                f11 = 0.35;
            } else if (a11 == 4) {
                f11 = 0.6;
            } else if (a11 == 5) {
                f11 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(11);
        }

        try {
            String s12 = request.getParameter("q12");
            Integer a12 = Integer.valueOf(request.getParameter("q12"));
            f12 = 0.0;
            if (a12 == 2) {
                f12 = 0.1;
            } else if (a12 == 3) {
                f12 = 0.35;
            } else if (a12 == 4) {
                f12 = 0.6;
            } else if (a12 == 5) {
                f12 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(12);
        }

        try {
            String s13 = request.getParameter("q13");
            Integer a13 = Integer.valueOf(request.getParameter("q13"));
            f13 = 0.0;
            if (a13 == 2) {
                f13 = 0.1;
            } else if (a13 == 3) {
                f13 = 0.35;
            } else if (a13 == 4) {
                f13 = 0.6;
            } else if (a13 == 5) {
                f13 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(13);
        }

        try {
            String s14 = request.getParameter("q14");
            Integer a14 = Integer.valueOf(request.getParameter("q14"));
            f14 = 0.0;
            if (a14 == 2) {
                f14 = 0.1;
            } else if (a14 == 3) {
                f14 = 0.35;
            } else if (a14 == 4) {
                f14 = 0.6;
            } else if (a14 == 5) {
                f14 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(14);
        }

        try {
            String s15 = request.getParameter("q15");
            Integer a15 = Integer.valueOf(request.getParameter("q15"));
            f15 = 0.0;
            if (a15 == 2) {
                f15 = 0.1;
            } else if (a15 == 3) {
                f15 = 0.35;
            } else if (a15 == 4) {
                f15 = 0.6;
            } else if (a15 == 5) {
                f15 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(15);
        }

        try {
            String s16 = request.getParameter("q16");
            Integer a16 = Integer.valueOf(request.getParameter("q16"));
            f16 = 0.0;
            if (a16 == 2) {
                f16 = 0.1;
            } else if (a16 == 3) {
                f16 = 0.35;
            } else if (a16 == 4) {
                f16 = 0.6;
            } else if (a16 == 5) {
                f16 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(16);
        }

        try {
            String s17 = request.getParameter("q17");
            Integer a17 = Integer.valueOf(request.getParameter("q17"));
            f17 = 0.0;
            if (a17 == 2) {
                f17 = 0.1;
            } else if (a17 == 3) {
                f17 = 0.35;
            } else if (a17 == 4) {
                f17 = 0.6;
            } else if (a17 == 5) {
                f17 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(17);
        }

        try {
            String s18 = request.getParameter("q18");
            Integer a18 = Integer.valueOf(request.getParameter("q18"));
            f18 = 0.0;
            if (a18 == 2) {
                f18 = 0.1;
            } else if (a18 == 3) {
                f18 = 0.35;
            } else if (a18 == 4) {
                f18 = 0.6;
            } else if (a18 == 5) {
                f18 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(18);
        }

        try {
            String s19 = request.getParameter("q19");
            Integer a19 = Integer.valueOf(request.getParameter("q19"));
            f19 = 0.0;
            if (a19 == 2) {
                f19 = 0.1;
            } else if (a19 == 3) {
                f19 = 0.35;
            } else if (a19 == 4) {
                f19 = 0.6;
            } else if (a19 == 5) {
                f19 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(19);
        }

        try {
            String s20 = request.getParameter("q20");
            Integer a20 = Integer.valueOf(request.getParameter("q20"));
            f20 = 0.0;
            if (a20 == 2) {
                f20 = 0.1;
            } else if (a20 == 3) {
                f20 = 0.35;
            } else if (a20 == 4) {
                f20 = 0.6;
            } else if (a20 == 5) {
                f20 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(20);
        }

        try {
            String s21 = request.getParameter("q21");
            Integer a21 = Integer.valueOf(request.getParameter("q21"));
            f21 = 0.0;
            if (a21 == 2) {
                f21 = 0.1;
            } else if (a21 == 3) {
                f21 = 0.35;
            } else if (a21 == 4) {
                f21 = 0.6;
            } else if (a21 == 5) {
                f21 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(21);
        }

        try {
            String s22 = request.getParameter("q22");
            Integer a22 = Integer.valueOf(request.getParameter("q22"));
            f22 = 0.0;
            if (a22 == 2) {
                f22 = 0.1;
            } else if (a22 == 3) {
                f22 = 0.35;
            } else if (a22 == 4) {
                f22 = 0.6;
            } else if (a22 == 5) {
                f22 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(22);
        }

        try {
            String s23 = request.getParameter("q23");
            Integer a23 = Integer.valueOf(request.getParameter("q23"));
            f23 = 0.0;
            if (a23 == 2) {
                f23 = 0.1;
            } else if (a23 == 3) {
                f23 = 0.35;
            } else if (a23 == 4) {
                f23 = 0.6;
            } else if (a23 == 5) {
                f23 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(23);
        }

        try {
            String s24 = request.getParameter("q24");
            Integer a24 = Integer.valueOf(request.getParameter("q24"));
            f24 = 0.0;
            if (a24 == 2) {
                f24 = 0.1;
            } else if (a24 == 3) {
                f24 = 0.35;
            } else if (a24 == 4) {
                f24 = 0.6;
            } else if (a24 == 5) {
                f24 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(24);
        }

        try {
            String s25 = request.getParameter("q25");
            Integer a25 = Integer.valueOf(request.getParameter("q25"));
            f25 = 0.0;
            if (a25 == 2) {
                f25 = 0.1;
            } else if (a25 == 3) {
                f25 = 0.35;
            } else if (a25 == 4) {
                f25 = 0.6;
            } else if (a25 == 5) {
                f25 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(25);
        }

        try {
            String s26 = request.getParameter("q26");
            Integer a26 = Integer.valueOf(request.getParameter("q26"));
            f26 = 0.0;
            if (a26 == 2) {
                f26 = 0.1;
            } else if (a26 == 3) {
                f26 = 0.35;
            } else if (a26 == 4) {
                f26 = 0.6;
            } else if (a26 == 5) {
                f26 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(26);
        }

        try {
            String s27 = request.getParameter("q27");
            Integer a27 = Integer.valueOf(request.getParameter("q27"));
            f27 = 0.0;
            if (a27 == 2) {
                f27 = 0.1;
            } else if (a27 == 3) {
                f27 = 0.35;
            } else if (a27 == 4) {
                f27 = 0.6;
            } else if (a27 == 5) {
                f27 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(27);
        }

        try {
            String s28 = request.getParameter("q28");
            Integer a28 = Integer.valueOf(request.getParameter("q28"));
            f28 = 0.0;
            if (a28 == 2) {
                f28 = 0.1;
            } else if (a28 == 3) {
                f28 = 0.35;
            } else if (a28 == 4) {
                f28 = 0.6;
            } else if (a28 == 5) {
                f28 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(28);
        }

        try {
            String s29 = request.getParameter("q29");
            Integer a29 = Integer.valueOf(request.getParameter("q29"));
            f29 = 0.0;
            if (a29 == 2) {
                f29 = 0.1;
            } else if (a29 == 3) {
                f29 = 0.35;
            } else if (a29 == 4) {
                f29 = 0.6;
            } else if (a29 == 5) {
                f29 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(29);
        }

        try {
            String s30 = request.getParameter("q30");
            Integer a30 = Integer.valueOf(request.getParameter("q30"));
            f30 = 0.0;
            if (a30 == 2) {
                f30 = 0.1;
            } else if (a30 == 3) {
                f30 = 0.35;
            } else if (a30 == 4) {
                f30 = 0.6;
            } else if (a30 == 5) {
                f30 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(30);
        }

        try {
            String s31 = request.getParameter("q31");
            Integer a31 = Integer.valueOf(request.getParameter("q31"));
            f31 = 0.0;
            if (a31 == 2) {
                f31 = 0.1;
            } else if (a31 == 3) {
                f31 = 0.35;
            } else if (a31 == 4) {
                f31 = 0.6;
            } else if (a31 == 5) {
                f31 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(31);
        }

        try {
            String s32 = request.getParameter("q32");
            Integer a32 = Integer.valueOf(request.getParameter("q32"));
            f32 = 0.0;
            if (a32 == 2) {
                f32 = 0.1;
            } else if (a32 == 3) {
                f32 = 0.35;
            } else if (a32 == 4) {
                f32 = 0.6;
            } else if (a32 == 5) {
                f32 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(32);
        }

        try {
            String s33 = request.getParameter("q33");
            Integer a33 = Integer.valueOf(request.getParameter("q33"));
            f33 = 0.0;
            if (a33 == 2) {
                f33 = 0.1;
            } else if (a33 == 3) {
                f33 = 0.35;
            } else if (a33 == 4) {
                f33 = 0.6;
            } else if (a33 == 5) {
                f33 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(33);
        }

        try {
            String s34 = request.getParameter("q34");
            Integer a34 = Integer.valueOf(request.getParameter("q34"));
            f34 = 0.0;
            if (a34 == 2) {
                f34 = 0.1;
            } else if (a34 == 3) {
                f34 = 0.35;
            } else if (a34 == 4) {
                f34 = 0.6;
            } else if (a34 == 5) {
                f34 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(34);
        }

        try {
            String s35 = request.getParameter("q35");
            Integer a35 = Integer.valueOf(request.getParameter("q35"));
            f35 = 0.0;
            if (a35 == 2) {
                f35 = 0.1;
            } else if (a35 == 3) {
                f35 = 0.35;
            } else if (a35 == 4) {
                f35 = 0.6;
            } else if (a35 == 5) {
                f35 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(35);
        }

        try {
            String s36 = request.getParameter("q36");
            Integer a36 = Integer.valueOf(request.getParameter("q36"));
            f36 = 0.0;
            if (a36 == 2) {
                f36 = 0.1;
            } else if (a36 == 3) {
                f36 = 0.35;
            } else if (a36 == 4) {
                f36 = 0.6;
            } else if (a36 == 5) {
                f36 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(36);
        }

        try {
            String s37 = request.getParameter("q37");
            Integer a37 = Integer.valueOf(request.getParameter("q37"));
            f37 = 0.0;
            if (a37 == 2) {
                f37 = 0.1;
            } else if (a37 == 3) {
                f37 = 0.35;
            } else if (a37 == 4) {
                f37 = 0.6;
            } else if (a37 == 5) {
                f37 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(37);
        }

        try {
            String s38 = request.getParameter("q38");
            Integer a38 = Integer.valueOf(request.getParameter("q38"));
            f38 = 0.0;
            if (a38 == 2) {
                f38 = 0.1;
            } else if (a38 == 3) {
                f38 = 0.35;
            } else if (a38 == 4) {
                f38 = 0.6;
            } else if (a38 == 5) {
                f38 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(38);
        }

        try {
            String s39 = request.getParameter("q39");
            Integer a39 = Integer.valueOf(request.getParameter("q39"));
            f39 = 0.0;
            if (a39 == 2) {
                f39 = 0.1;
            } else if (a39 == 3) {
                f39 = 0.35;
            } else if (a39 == 4) {
                f39 = 0.6;
            } else if (a39 == 5) {
                f39 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(39);
        }

        try {
            String s40 = request.getParameter("q40");
            Integer a40 = Integer.valueOf(request.getParameter("q40"));
            f40 = 0.0;
            if (a40 == 2) {
                f40 = 0.1;
            } else if (a40 == 3) {
                f40 = 0.35;
            } else if (a40 == 4) {
                f40 = 0.6;
            } else if (a40 == 5) {
                f40 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(40);
        }

        try {
            String s41 = request.getParameter("q41");
            Integer a41 = Integer.valueOf(request.getParameter("q41"));
            f41 = 0.0;
            if (a41 == 2) {
                f41 = 0.1;
            } else if (a41 == 3) {
                f41 = 0.35;
            } else if (a41 == 4) {
                f41 = 0.6;
            } else if (a41 == 5) {
                f41 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(41);
        }

        try {
            String s42 = request.getParameter("q42");
            Integer a42 = Integer.valueOf(request.getParameter("q42"));
            f42 = 0.0;
            if (a42 == 2) {
                f42 = 0.1;
            } else if (a42 == 3) {
                f42 = 0.35;
            } else if (a42 == 4) {
                f42 = 0.6;
            } else if (a42 == 5) {
                f42 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(42);
        }

        try {
            String s43 = request.getParameter("q43");
            Integer a43 = Integer.valueOf(request.getParameter("q43"));
            f43 = 0.0;
            if (a43 == 2) {
                f43 = 0.1;
            } else if (a43 == 3) {
                f43 = 0.35;
            } else if (a43 == 4) {
                f43 = 0.6;
            } else if (a43 == 5) {
                f43 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(43);
        }

        try {
            String s44 = request.getParameter("q44");
            Integer a44 = Integer.valueOf(request.getParameter("q44"));
            f44 = 0.0;
            if (a44 == 2) {
                f44 = 0.1;
            } else if (a44 == 3) {
                f44 = 0.35;
            } else if (a44 == 4) {
                f44 = 0.6;
            } else if (a44 == 5) {
                f44 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(44);
        }

        try {
            String s45 = request.getParameter("q45");
            Integer a45 = Integer.valueOf(request.getParameter("q45"));
            f45 = 0.0;
            if (a45 == 2) {
                f45 = 0.1;
            } else if (a45 == 3) {
                f45 = 0.35;
            } else if (a45 == 4) {
                f45 = 0.6;
            } else if (a45 == 5) {
                f45 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(45);
        }

        try {
            String s46 = request.getParameter("q46");
            Integer a46 = Integer.valueOf(request.getParameter("q46"));
            f46 = 0.0;
            if (a46 == 2) {
                f46 = 0.1;
            } else if (a46 == 3) {
                f46 = 0.35;
            } else if (a46 == 4) {
                f46 = 0.6;
            } else if (a46 == 5) {
                f46 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(46);
        }

        try {
            String s47 = request.getParameter("q47");
            Integer a47 = Integer.valueOf(request.getParameter("q47"));
            f47 = 0.0;
            if (a47 == 2) {
                f47 = 0.1;
            } else if (a47 == 3) {
                f47 = 0.35;
            } else if (a47 == 4) {
                f47 = 0.6;
            } else if (a47 == 5) {
                f47 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(47);
        }

        try {
            String s48 = request.getParameter("q48");
            Integer a48 = Integer.valueOf(request.getParameter("q48"));
            f48 = 0.0;
            if (a48 == 2) {
                f48 = 0.1;
            } else if (a48 == 3) {
                f48 = 0.35;
            } else if (a48 == 4) {
                f48 = 0.6;
            } else if (a48 == 5) {
                f48 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(48);
        }

        try {
            String s49 = request.getParameter("q49");
            Integer a49 = Integer.valueOf(request.getParameter("q49"));
            f49 = 0.0;
            if (a49 == 2) {
                f49 = 0.1;
            } else if (a49 == 3) {
                f49 = 0.35;
            } else if (a49 == 4) {
                f49 = 0.6;
            } else if (a49 == 5) {
                f49 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(49);
        }

        try {
            String s50 = request.getParameter("q50");
            Integer a50 = Integer.valueOf(request.getParameter("q50"));
            f50 = 0.0;
            if (a50 == 2) {
                f50 = 0.1;
            } else if (a50 == 3) {
                f50 = 0.35;
            } else if (a50 == 4) {
                f50 = 0.6;
            } else if (a50 == 5) {
                f50 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(50);
        }

        try {
            String s51 = request.getParameter("q51");
            Integer a51 = Integer.valueOf(request.getParameter("q51"));
            f51 = 0.0;
            if (a51 == 2) {
                f51 = 0.1;
            } else if (a51 == 3) {
                f51 = 0.35;
            } else if (a51 == 4) {
                f51 = 0.6;
            } else if (a51 == 5) {
                f51 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(51);
        }

        try {
            String s52 = request.getParameter("q52");
            Integer a52 = Integer.valueOf(request.getParameter("q52"));
            f52 = 0.0;
            if (a52 == 2) {
                f52 = 0.1;
            } else if (a52 == 3) {
                f52 = 0.35;
            } else if (a52 == 4) {
                f52 = 0.6;
            } else if (a52 == 5) {
                f52 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(52);
        }

        try {
            String s53 = request.getParameter("q53");
            Integer a53 = Integer.valueOf(request.getParameter("q53"));
            f53 = 0.0;
            if (a53 == 2) {
                f53 = 0.1;
            } else if (a53 == 3) {
                f53 = 0.35;
            } else if (a53 == 4) {
                f53 = 0.6;
            } else if (a53 == 5) {
                f53 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(53);
        }

        try {
            String s54 = request.getParameter("q54");
            Integer a54 = Integer.valueOf(request.getParameter("q54"));
            f54 = 0.0;
            if (a54 == 2) {
                f54 = 0.1;
            } else if (a54 == 3) {
                f54 = 0.35;
            } else if (a54 == 4) {
                f54 = 0.6;
            } else if (a54 == 5) {
                f54 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(54);
        }

        try {
            String s55 = request.getParameter("q55");
            Integer a55 = Integer.valueOf(request.getParameter("q55"));
            f55 = 0.0;
            if (a55 == 2) {
                f55 = 0.1;
            } else if (a55 == 3) {
                f55 = 0.35;
            } else if (a55 == 4) {
                f55 = 0.6;
            } else if (a55 == 5) {
                f55 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(55);
        }

        try {
            String s56 = request.getParameter("q56");
            Integer a56 = Integer.valueOf(request.getParameter("q56"));
            f56 = 0.0;
            if (a56 == 2) {
                f56 = 0.1;
            } else if (a56 == 3) {
                f56 = 0.35;
            } else if (a56 == 4) {
                f56 = 0.6;
            } else if (a56 == 5) {
                f56 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(56);
        }

        try {
            String s57 = request.getParameter("q57");
            Integer a57 = Integer.valueOf(request.getParameter("q57"));
            f57 = 0.0;
            if (a57 == 2) {
                f57 = 0.1;
            } else if (a57 == 3) {
                f57 = 0.35;
            } else if (a57 == 4) {
                f57 = 0.6;
            } else if (a57 == 5) {
                f57 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(57);
        }

        try {
            String s58 = request.getParameter("q58");
            Integer a58 = Integer.valueOf(request.getParameter("q58"));
            f58 = 0.0;
            if (a58 == 2) {
                f58 = 0.1;
            } else if (a58 == 3) {
                f58 = 0.35;
            } else if (a58 == 4) {
                f58 = 0.6;
            } else if (a58 == 5) {
                f58 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(58);
        }

        try {
            String s59 = request.getParameter("q59");
            Integer a59 = Integer.valueOf(request.getParameter("q59"));
            f59 = 0.0;
            if (a59 == 2) {
                f59 = 0.1;
            } else if (a59 == 3) {
                f59 = 0.35;
            } else if (a59 == 4) {
                f59 = 0.6;
            } else if (a59 == 5) {
                f59 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(59);
        }

        try {
            String s60 = request.getParameter("q60");
            Integer a60 = Integer.valueOf(request.getParameter("q60"));
            f60 = 0.0;
            if (a60 == 2) {
                f60 = 0.1;
            } else if (a60 == 3) {
                f60 = 0.35;
            } else if (a60 == 4) {
                f60 = 0.6;
            } else if (a60 == 5) {
                f60 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(60);
        }

        try {
            String s61 = request.getParameter("q61");
            Integer a61 = Integer.valueOf(request.getParameter("q61"));
            f61 = 0.0;
            if (a61 == 2) {
                f61 = 0.1;
            } else if (a61 == 3) {
                f61 = 0.35;
            } else if (a61 == 4) {
                f61 = 0.6;
            } else if (a61 == 5) {
                f61 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(61);
        }

        try {
            String s62 = request.getParameter("q62");
            Integer a62 = Integer.valueOf(request.getParameter("q62"));
            f62 = 0.0;
            if (a62 == 2) {
                f62 = 0.1;
            } else if (a62 == 3) {
                f62 = 0.35;
            } else if (a62 == 4) {
                f62 = 0.6;
            } else if (a62 == 5) {
                f62 = 0.9;
            }
        } catch (NumberFormatException e) {
            notChooseQuestions.add(62);
        }

        HttpSession session = request.getSession();
//        if (!notChooseQuestions.isEmpty()) {
//            url = "TriThuc.jsp";
//            request.setAttribute("notChooseQuestions", notChooseQuestions);
//            request.getRequestDispatcher(url).forward(request, response);
//        } else {
            g1 = 3 * (1.0f - Math.abs(0.6 - f1))
                    + 2 * (1.0 - Math.abs(0.9 - f2))
                    + 1 * (1.0 - Math.abs(0.35 - f3))
                    + 3 * (1.0 - Math.abs(0.6 - f4))
                    + 3 * (1.0 - Math.abs(0.9 - f5))
                    + 1 * (1.0 - Math.abs(0.6 - f6))
                    + 3 * (1.0 - Math.abs(0.6 - f7))
                    + 2 * (1.0 - Math.abs(0.35 - f8))
                    + 2 * (1.0 - Math.abs(0.35 - f9))
                    + 1 * (1.0 - Math.abs(0.35 - f10))
                    + 1 * (1.0 - Math.abs(0.9 - f11))
                    + 2 * (1.0 - Math.abs(0.1 - f12))
                    + 3 * (1.0 - Math.abs(0.35 - f13))
                    + 3 * (1.0 - Math.abs(0.35 - f14))
                    + 2 * (1.0 - Math.abs(0.1 - f15))
                    + 1 * (1.0 - Math.abs(0.1 - f16))
                    + 2 * (1.0 - Math.abs(0.35 - f17))
                    + 2 * (1.0 - Math.abs(0.1 - f18))
                    + 1 * (1.0 - Math.abs(0.6 - f19))
                    + 3 * (1.0 - Math.abs(0.35 - f20))
                    + 3 * (1.0 - Math.abs(0.35 - f21))
                    + 2 * (1.0 - Math.abs(0.35 - f22))
                    + 3 * (1.0 - Math.abs(0.35 - f23))
                    + 3 * (1.0 - Math.abs(0.0 - f24))
                    + 3 * (1.0 - Math.abs(0.0 - f25))
                    + 3 * (1.0 - Math.abs(0.0 - f26))
                    + 1 * (1.0 - Math.abs(0.0 - f27))
                    + 1 * (1.0 - Math.abs(0.0 - f28))
                    + 2 * (1.0 - Math.abs(0.0 - f29))
                    + 2 * (1.0 - Math.abs(0.0 - f30))
                    + 3 * (1.0 - Math.abs(0.0 - f31))
                    + 2 * (1.0 - Math.abs(0.35 - f32))
                    + 3 * (1.0 - Math.abs(0.1 - f33))
                    + 2 * (1.0 - Math.abs(0.0 - f34))
                    + 2 * (1.0 - Math.abs(0.1 - f35))
                    + 3 * (1.0 - Math.abs(0.35 - f36))
                    + 3 * (1.0 - Math.abs(0.35 - f37))
                    + 2 * (1.0 - Math.abs(0.35 - f38))
                    + 2 * (1.0 - Math.abs(0.1 - f39))
                    + 2 * (1.0 - Math.abs(0.1 - f40))
                    + 1 * (1.0 - Math.abs(0.1 - f41))
                    + 1 * (1.0 - Math.abs(0.6 - f42))
                    + 3 * (1.0 - Math.abs(0.35 - f43))
                    + 2 * (1.0 - Math.abs(0.35 - f44))
                    + 1 * (1.0 - Math.abs(0.1 - f45))
                    + 3 * (1.0 - Math.abs(0.1 - f46))
                    + 2 * (1.0 - Math.abs(0.35 - f47))
                    + 3 * (1.0 - Math.abs(0.35 - f48))
                    + 2 * (1.0 - Math.abs(0.35 - f49))
                    + 2 * (1.0 - Math.abs(0.6 - f50))
                    + 3 * (1.0 - Math.abs(0.35 - f51))
                    + 3 * (1.0 - Math.abs(0.35 - f52))
                    + 3 * (1.0 - Math.abs(0.1 - f53))
                    + 2 * (1.0 - Math.abs(0.0 - f54))
                    + 1 * (1.0 - Math.abs(0.1 - f55))
                    + 2 * (1.0 - Math.abs(0.0 - f56))
                    + 3 * (1.0 - Math.abs(0.1 - f57))
                    + 3 * (1.0 - Math.abs(0.1 - f58))
                    + 2 * (1.0 - Math.abs(0.1 - f59))
                    + 3 * (1.0 - Math.abs(0.35 - f60))
                    + 2 * (1.0 - Math.abs(0.35 - f61))
                    + 2 * (1.0 - Math.abs(0.1 - f62));

            g2 = 3 * (1.0f - Math.abs(0.0 - f1))
                    + 2 * (1.0 - Math.abs(0.1 - f2))
                    + 1 * (1.0 - Math.abs(0.0 - f3))
                    + 3 * (1.0 - Math.abs(0.1 - f4))
                    + 3 * (1.0 - Math.abs(0.0 - f5))
                    + 1 * (1.0 - Math.abs(0.0 - f6))
                    + 3 * (1.0 - Math.abs(0.0 - f7))
                    + 2 * (1.0 - Math.abs(0.6 - f8))
                    + 2 * (1.0 - Math.abs(0.1 - f9))
                    + 1 * (1.0 - Math.abs(0.1 - f10))
                    + 1 * (1.0 - Math.abs(0.0 - f11))
                    + 2 * (1.0 - Math.abs(0.6 - f12))
                    + 3 * (1.0 - Math.abs(0.6 - f13))
                    + 3 * (1.0 - Math.abs(0.6 - f14))
                    + 2 * (1.0 - Math.abs(0.9 - f15))
                    + 1 * (1.0 - Math.abs(0.9 - f16))
                    + 2 * (1.0 - Math.abs(0.6 - f17))
                    + 2 * (1.0 - Math.abs(0.6 - f18))
                    + 1 * (1.0 - Math.abs(0.35 - f19))
                    + 3 * (1.0 - Math.abs(0.35 - f20))
                    + 3 * (1.0 - Math.abs(0.9 - f21))
                    + 2 * (1.0 - Math.abs(0.6 - f22))
                    + 3 * (1.0 - Math.abs(0.1 - f23))
                    + 3 * (1.0 - Math.abs(0.0 - f24))
                    + 3 * (1.0 - Math.abs(0.0 - f25))
                    + 3 * (1.0 - Math.abs(0.0 - f26))
                    + 1 * (1.0 - Math.abs(0.0 - f27))
                    + 1 * (1.0 - Math.abs(0.0 - f28))
                    + 2 * (1.0 - Math.abs(0.0 - f29))
                    + 2 * (1.0 - Math.abs(0.0 - f30))
                    + 3 * (1.0 - Math.abs(0.0 - f31))
                    + 2 * (1.0 - Math.abs(0.1 - f32))
                    + 3 * (1.0 - Math.abs(0.1 - f33))
                    + 2 * (1.0 - Math.abs(0.0 - f34))
                    + 2 * (1.0 - Math.abs(0.1 - f35))
                    + 3 * (1.0 - Math.abs(0.35 - f36))
                    + 3 * (1.0 - Math.abs(0.35 - f37))
                    + 2 * (1.0 - Math.abs(0.6 - f38))
                    + 2 * (1.0 - Math.abs(0.1 - f39))
                    + 2 * (1.0 - Math.abs(0.35 - f40))
                    + 1 * (1.0 - Math.abs(0.35 - f41))
                    + 1 * (1.0 - Math.abs(0.1 - f42))
                    + 3 * (1.0 - Math.abs(0.1 - f43))
                    + 2 * (1.0 - Math.abs(0.0 - f44))
                    + 1 * (1.0 - Math.abs(0.35 - f45))
                    + 3 * (1.0 - Math.abs(0.1 - f46))
                    + 2 * (1.0 - Math.abs(0.1 - f47))
                    + 3 * (1.0 - Math.abs(0.35 - f48))
                    + 2 * (1.0 - Math.abs(0.35 - f49))
                    + 2 * (1.0 - Math.abs(0.9 - f50))
                    + 3 * (1.0 - Math.abs(0.0 - f51))
                    + 3 * (1.0 - Math.abs(0.6 - f52))
                    + 3 * (1.0 - Math.abs(0.1 - f53))
                    + 2 * (1.0 - Math.abs(0.1 - f54))
                    + 1 * (1.0 - Math.abs(0.1 - f55))
                    + 2 * (1.0 - Math.abs(0.0 - f56))
                    + 3 * (1.0 - Math.abs(0.1 - f57))
                    + 3 * (1.0 - Math.abs(0.1 - f58))
                    + 2 * (1.0 - Math.abs(0.6 - f59))
                    + 3 * (1.0 - Math.abs(0.6 - f60))
                    + 2 * (1.0 - Math.abs(0.6 - f61))
                    + 2 * (1.0 - Math.abs(0.1 - f62));
            g3 = 3 * (1.0f - Math.abs(0.0 - f1))
                    + 2 * (1.0 - Math.abs(0.0 - f2))
                    + 1 * (1.0 - Math.abs(0.35 - f3))
                    + 3 * (1.0 - Math.abs(0.35 - f4))
                    + 3 * (1.0 - Math.abs(0.9 - f5))
                    + 1 * (1.0 - Math.abs(0.0 - f6))
                    + 3 * (1.0 - Math.abs(0.0 - f7))
                    + 2 * (1.0 - Math.abs(0.1 - f8))
                    + 2 * (1.0 - Math.abs(0.35 - f9))
                    + 1 * (1.0 - Math.abs(0.35 - f10))
                    + 1 * (1.0 - Math.abs(0.1 - f11))
                    + 2 * (1.0 - Math.abs(0.9 - f12))
                    + 3 * (1.0 - Math.abs(0.35 - f13))
                    + 3 * (1.0 - Math.abs(0.35 - f14))
                    + 2 * (1.0 - Math.abs(0.1 - f15))
                    + 1 * (1.0 - Math.abs(0.0 - f16))
                    + 2 * (1.0 - Math.abs(0.1 - f17))
                    + 2 * (1.0 - Math.abs(0.9 - f18))
                    + 1 * (1.0 - Math.abs(0.35 - f19))
                    + 3 * (1.0 - Math.abs(0.9 - f20))
                    + 3 * (1.0 - Math.abs(0.0 - f21))
                    + 2 * (1.0 - Math.abs(0.0 - f22))
                    + 3 * (1.0 - Math.abs(0.9 - f23))
                    + 3 * (1.0 - Math.abs(0.9 - f24))
                    + 3 * (1.0 - Math.abs(0.9 - f25))
                    + 3 * (1.0 - Math.abs(0.9 - f26))
                    + 1 * (1.0 - Math.abs(0.9 - f27))
                    + 1 * (1.0 - Math.abs(0.9 - f28))
                    + 2 * (1.0 - Math.abs(0.9 - f29))
                    + 2 * (1.0 - Math.abs(0.9 - f30))
                    + 3 * (1.0 - Math.abs(0.9 - f31))
                    + 2 * (1.0 - Math.abs(0.1 - f32))
                    + 3 * (1.0 - Math.abs(0.1 - f33))
                    + 2 * (1.0 - Math.abs(0.0 - f34))
                    + 2 * (1.0 - Math.abs(0.35 - f35))
                    + 3 * (1.0 - Math.abs(0.35 - f36))
                    + 3 * (1.0 - Math.abs(0.6 - f37))
                    + 2 * (1.0 - Math.abs(0.35 - f38))
                    + 2 * (1.0 - Math.abs(0.6 - f39))
                    + 2 * (1.0 - Math.abs(0.1 - f40))
                    + 1 * (1.0 - Math.abs(0.6 - f41))
                    + 1 * (1.0 - Math.abs(0.35 - f42))
                    + 3 * (1.0 - Math.abs(0.35 - f43))
                    + 2 * (1.0 - Math.abs(0.35 - f44))
                    + 1 * (1.0 - Math.abs(0.6 - f45))
                    + 3 * (1.0 - Math.abs(0.35 - f46))
                    + 2 * (1.0 - Math.abs(0.35 - f47))
                    + 3 * (1.0 - Math.abs(0.0 - f48))
                    + 2 * (1.0 - Math.abs(0.0 - f49))
                    + 2 * (1.0 - Math.abs(0.35 - f50))
                    + 3 * (1.0 - Math.abs(0.35 - f51))
                    + 3 * (1.0 - Math.abs(0.9 - f52))
                    + 3 * (1.0 - Math.abs(0.6 - f53))
                    + 2 * (1.0 - Math.abs(0.9 - f54))
                    + 1 * (1.0 - Math.abs(0.6 - f55))
                    + 2 * (1.0 - Math.abs(0.9 - f56))
                    + 3 * (1.0 - Math.abs(0.35 - f57))
                    + 3 * (1.0 - Math.abs(0.1 - f58))
                    + 2 * (1.0 - Math.abs(0.1 - f59))
                    + 3 * (1.0 - Math.abs(0.1 - f60))
                    + 2 * (1.0 - Math.abs(0.1 - f61))
                    + 2 * (1.0 - Math.abs(0.1 - f62));
            g4 = 3 * (1.0f - Math.abs(0.1 - f1))
                    + 2 * (1.0 - Math.abs(0.1 - f2))
                    + 1 * (1.0 - Math.abs(0.35 - f3))
                    + 3 * (1.0 - Math.abs(0.1 - f4))
                    + 3 * (1.0 - Math.abs(0.0 - f5))
                    + 1 * (1.0 - Math.abs(0.0 - f6))
                    + 3 * (1.0 - Math.abs(0.0 - f7))
                    + 2 * (1.0 - Math.abs(0.6 - f8))
                    + 2 * (1.0 - Math.abs(0.6 - f9))
                    + 1 * (1.0 - Math.abs(0.6 - f10))
                    + 1 * (1.0 - Math.abs(0.1 - f11))
                    + 2 * (1.0 - Math.abs(0.1 - f12))
                    + 3 * (1.0 - Math.abs(0.1 - f13))
                    + 3 * (1.0 - Math.abs(0.1 - f14))
                    + 2 * (1.0 - Math.abs(0.0 - f15))
                    + 1 * (1.0 - Math.abs(0.0 - f16))
                    + 2 * (1.0 - Math.abs(0.1 - f17))
                    + 2 * (1.0 - Math.abs(0.1 - f18))
                    + 1 * (1.0 - Math.abs(0.6 - f19))
                    + 3 * (1.0 - Math.abs(0.1 - f20))
                    + 3 * (1.0 - Math.abs(0.0 - f21))
                    + 2 * (1.0 - Math.abs(0.0 - f22))
                    + 3 * (1.0 - Math.abs(0.1 - f23))
                    + 3 * (1.0 - Math.abs(0.1 - f24))
                    + 3 * (1.0 - Math.abs(0.1 - f25))
                    + 3 * (1.0 - Math.abs(0.0 - f26))
                    + 1 * (1.0 - Math.abs(0.35 - f27))
                    + 1 * (1.0 - Math.abs(0.1 - f28))
                    + 2 * (1.0 - Math.abs(0.1 - f29))
                    + 2 * (1.0 - Math.abs(0.35 - f30))
                    + 3 * (1.0 - Math.abs(0.1 - f31))
                    + 2 * (1.0 - Math.abs(0.9 - f32))
                    + 3 * (1.0 - Math.abs(0.35 - f33))
                    + 2 * (1.0 - Math.abs(0.6 - f34))
                    + 2 * (1.0 - Math.abs(0.35 - f35))
                    + 3 * (1.0 - Math.abs(0.6 - f36))
                    + 3 * (1.0 - Math.abs(0.6 - f37))
                    + 2 * (1.0 - Math.abs(0.9 - f38))
                    + 2 * (1.0 - Math.abs(0.6 - f39))
                    + 2 * (1.0 - Math.abs(0.9 - f40))
                    + 1 * (1.0 - Math.abs(0.9 - f41))
                    + 1 * (1.0 - Math.abs(0.6 - f42))
                    + 3 * (1.0 - Math.abs(0.6 - f43))
                    + 2 * (1.0 - Math.abs(0.1 - f44))
                    + 1 * (1.0 - Math.abs(0.6 - f45))
                    + 3 * (1.0 - Math.abs(0.6 - f46))
                    + 2 * (1.0 - Math.abs(0.1 - f47))
                    + 3 * (1.0 - Math.abs(0.35 - f48))
                    + 2 * (1.0 - Math.abs(0.1 - f49))
                    + 2 * (1.0 - Math.abs(0.1 - f50))
                    + 3 * (1.0 - Math.abs(0.1 - f51))
                    + 3 * (1.0 - Math.abs(0.35 - f52))
                    + 3 * (1.0 - Math.abs(0.35 - f53))
                    + 2 * (1.0 - Math.abs(0.0 - f54))
                    + 1 * (1.0 - Math.abs(0.6 - f55))
                    + 2 * (1.0 - Math.abs(0.1 - f56))
                    + 3 * (1.0 - Math.abs(0.35 - f57))
                    + 3 * (1.0 - Math.abs(0.35 - f58))
                    + 2 * (1.0 - Math.abs(0.35 - f59))
                    + 3 * (1.0 - Math.abs(0.35 - f60))
                    + 2 * (1.0 - Math.abs(0.6 - f61))
                    + 2 * (1.0 - Math.abs(0.1 - f62));
            g5 = 3 * (1.0f - Math.abs(0.0 - f1))
                    + 2 * (1.0 - Math.abs(0.0 - f2))
                    + 1 * (1.0 - Math.abs(0.0 - f3))
                    + 3 * (1.0 - Math.abs(0.1 - f4))
                    + 3 * (1.0 - Math.abs(0.0 - f5))
                    + 1 * (1.0 - Math.abs(0.0 - f6))
                    + 3 * (1.0 - Math.abs(0.0 - f7))
                    + 2 * (1.0 - Math.abs(0.35 - f8))
                    + 2 * (1.0 - Math.abs(0.35 - f9))
                    + 1 * (1.0 - Math.abs(0.1 - f10))
                    + 1 * (1.0 - Math.abs(0.0 - f11))
                    + 2 * (1.0 - Math.abs(0.0 - f12))
                    + 3 * (1.0 - Math.abs(0.35 - f13))
                    + 3 * (1.0 - Math.abs(0.0 - f14))
                    + 2 * (1.0 - Math.abs(0.35 - f15))
                    + 1 * (1.0 - Math.abs(0.0 - f16))
                    + 2 * (1.0 - Math.abs(0.6 - f17))
                    + 2 * (1.0 - Math.abs(0.35 - f18))
                    + 1 * (1.0 - Math.abs(0.6 - f19))
                    + 3 * (1.0 - Math.abs(0.6 - f20))
                    + 3 * (1.0 - Math.abs(0.0 - f21))
                    + 2 * (1.0 - Math.abs(0.0 - f22))
                    + 3 * (1.0 - Math.abs(0.0 - f23))
                    + 3 * (1.0 - Math.abs(0.0 - f24))
                    + 3 * (1.0 - Math.abs(0.0 - f25))
                    + 3 * (1.0 - Math.abs(0.0 - f26))
                    + 1 * (1.0 - Math.abs(0.0 - f27))
                    + 1 * (1.0 - Math.abs(0.0 - f28))
                    + 2 * (1.0 - Math.abs(0.0 - f29))
                    + 2 * (1.0 - Math.abs(0.0 - f30))
                    + 3 * (1.0 - Math.abs(0.0 - f31))
                    + 2 * (1.0 - Math.abs(0.1 - f32))
                    + 3 * (1.0 - Math.abs(0.6 - f33))
                    + 2 * (1.0 - Math.abs(0.9 - f34))
                    + 2 * (1.0 - Math.abs(0.6 - f35))
                    + 3 * (1.0 - Math.abs(0.6 - f36))
                    + 3 * (1.0 - Math.abs(0.6 - f37))
                    + 2 * (1.0 - Math.abs(0.35 - f38))
                    + 2 * (1.0 - Math.abs(0.6 - f39))
                    + 2 * (1.0 - Math.abs(0.1 - f40))
                    + 1 * (1.0 - Math.abs(0.35 - f41))
                    + 1 * (1.0 - Math.abs(0.35 - f42))
                    + 3 * (1.0 - Math.abs(0.9 - f43))
                    + 2 * (1.0 - Math.abs(0.9 - f44))
                    + 1 * (1.0 - Math.abs(0.6 - f45))
                    + 3 * (1.0 - Math.abs(0.9 - f46))
                    + 2 * (1.0 - Math.abs(0.9 - f47))
                    + 3 * (1.0 - Math.abs(0.6 - f48))
                    + 2 * (1.0 - Math.abs(0.6 - f49))
                    + 2 * (1.0 - Math.abs(0.6 - f50))
                    + 3 * (1.0 - Math.abs(0.6 - f51))
                    + 3 * (1.0 - Math.abs(0.35 - f52))
                    + 3 * (1.0 - Math.abs(0.9 - f53))
                    + 2 * (1.0 - Math.abs(0.6 - f54))
                    + 1 * (1.0 - Math.abs(0.9 - f55))
                    + 2 * (1.0 - Math.abs(0.6 - f56))
                    + 3 * (1.0 - Math.abs(0.6 - f57))
                    + 3 * (1.0 - Math.abs(0.9 - f58))
                    + 2 * (1.0 - Math.abs(0.9 - f59))
                    + 3 * (1.0 - Math.abs(0.9 - f60))
                    + 2 * (1.0 - Math.abs(0.9 - f61))
                    + 2 * (1.0 - Math.abs(0.9 - f62));
            g6 = 3 * (1.0f - Math.abs(0.0 - f1))
                    + 2 * (1.0 - Math.abs(0.0 - f2))
                    + 1 * (1.0 - Math.abs(0.0 - f3))
                    + 3 * (1.0 - Math.abs(0.1 - f4))
                    + 3 * (1.0 - Math.abs(0.0 - f5))
                    + 1 * (1.0 - Math.abs(0.0 - f6))
                    + 3 * (1.0 - Math.abs(0.0 - f7))
                    + 2 * (1.0 - Math.abs(0.0 - f8))
                    + 2 * (1.0 - Math.abs(0.1 - f9))
                    + 1 * (1.0 - Math.abs(0.0 - f10))
                    + 1 * (1.0 - Math.abs(0.0 - f11))
                    + 2 * (1.0 - Math.abs(0.1 - f12))
                    + 3 * (1.0 - Math.abs(0.6 - f13))
                    + 3 * (1.0 - Math.abs(0.1 - f14))
                    + 2 * (1.0 - Math.abs(0.1 - f15))
                    + 1 * (1.0 - Math.abs(0.0 - f16))
                    + 2 * (1.0 - Math.abs(0.6 - f17))
                    + 2 * (1.0 - Math.abs(0.1 - f18))
                    + 1 * (1.0 - Math.abs(0.6 - f19))
                    + 3 * (1.0 - Math.abs(0.9 - f20))
                    + 3 * (1.0 - Math.abs(0.0 - f21))
                    + 2 * (1.0 - Math.abs(0.0 - f22))
                    + 3 * (1.0 - Math.abs(0.0 - f23))
                    + 3 * (1.0 - Math.abs(0.0 - f24))
                    + 3 * (1.0 - Math.abs(0.0 - f25))
                    + 3 * (1.0 - Math.abs(0.0 - f26))
                    + 1 * (1.0 - Math.abs(0.0 - f27))
                    + 1 * (1.0 - Math.abs(0.0 - f28))
                    + 2 * (1.0 - Math.abs(0.0 - f29))
                    + 2 * (1.0 - Math.abs(0.0 - f30))
                    + 3 * (1.0 - Math.abs(0.0 - f31))
                    + 2 * (1.0 - Math.abs(0.1 - f32))
                    + 3 * (1.0 - Math.abs(0.1 - f33))
                    + 2 * (1.0 - Math.abs(0.0 - f34))
                    + 2 * (1.0 - Math.abs(0.35 - f35))
                    + 3 * (1.0 - Math.abs(0.35 - f36))
                    + 3 * (1.0 - Math.abs(0.35 - f37))
                    + 2 * (1.0 - Math.abs(0.35 - f38))
                    + 2 * (1.0 - Math.abs(0.35 - f39))
                    + 2 * (1.0 - Math.abs(0.1 - f40))
                    + 1 * (1.0 - Math.abs(0.1 - f41))
                    + 1 * (1.0 - Math.abs(0.1 - f42))
                    + 3 * (1.0 - Math.abs(0.1 - f43))
                    + 2 * (1.0 - Math.abs(0.0 - f44))
                    + 1 * (1.0 - Math.abs(0.1 - f45))
                    + 3 * (1.0 - Math.abs(0.1 - f46))
                    + 2 * (1.0 - Math.abs(0.35 - f47))
                    + 3 * (1.0 - Math.abs(0.9 - f48))
                    + 2 * (1.0 - Math.abs(0.6 - f49))
                    + 2 * (1.0 - Math.abs(0.9 - f50))
                    + 3 * (1.0 - Math.abs(0.9 - f51))
                    + 3 * (1.0 - Math.abs(0.9 - f52))
                    + 3 * (1.0 - Math.abs(0.1 - f53))
                    + 2 * (1.0 - Math.abs(0.0 - f54))
                    + 1 * (1.0 - Math.abs(0.1 - f55))
                    + 2 * (1.0 - Math.abs(0.0 - f56))
                    + 3 * (1.0 - Math.abs(0.1 - f57))
                    + 3 * (1.0 - Math.abs(0.6 - f58))
                    + 2 * (1.0 - Math.abs(0.9 - f59))
                    + 3 * (1.0 - Math.abs(0.9 - f60))
                    + 2 * (1.0 - Math.abs(0.9 - f61))
                    + 2 * (1.0 - Math.abs(0.6 - f62));
            Result result = findMaxWithVariable(g1 / 137, g2 / 137, g3 / 137, g4 / 137, g5 / 137, g6 / 137);

            if (result.variableName.equals("g1")) {
                url = "KetQua/TinhCach1.jsp";
                session.setAttribute("TC1", "TinhCach");
            } else if (result.variableName.equals("g2")) {
                url = "KetQua/TinhCach2.jsp";
                session.setAttribute("TC2", "TinhCach");
            } else if (result.variableName.equals("g3")) {
                url = "KetQua/TinhCach3.jsp";
                session.setAttribute("TC3", "TinhCach");
            } else if (result.variableName.equals("g4")) {
                url = "KetQua/TinhCach4.jsp";
                session.setAttribute("TC4", "TinhCach");
            } else if (result.variableName.equals("g5")) {
                url = "KetQua/TinhCach5.jsp";
                session.setAttribute("TC5", "TinhCach");
            } else if (result.variableName.equals("g6")) {
                url = "KetQua/TinhCach6.jsp";
                session.setAttribute("TC6", "TinhCach");
            }
            User user = (User) session.getAttribute("user");
            System.out.println("ID dang dang nhap : " + user.getId());
            try {
                careerService.saveAnswer(result.maxValue, result.variableName, user);
                trainningService.saveAnswer(
                        (String) session.getAttribute("mark"),
                        (String) session.getAttribute("capacity"),
                        (String) session.getAttribute("tuition"),
                        (String) session.getAttribute("time"),
                        (String) session.getAttribute("knowledge"),
                        (String) session.getAttribute("CTDT"), user);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MultiChoiceController.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (session.getAttribute("CTDT").equals("DH")) {
                request.setAttribute("Đại học", "KQCTDT");
                if (result.variableName.equals("g1")) {
                    url = "DaiHoc/TinhCach1.jsp";
                    session.setAttribute("TC1", "TinhCach");
                } else if (result.variableName.equals("g2")) {
                    url = "DaiHoc/TinhCach2.jsp";
                    session.setAttribute("TC2", "TinhCach");
                } else if (result.variableName.equals("g3")) {
                    url = "DaiHoc/TinhCach3.jsp";
                    session.setAttribute("TC3", "TinhCach");
                } else if (result.variableName.equals("g4")) {
                    url = "DaiHoc/TinhCach4.jsp";
                    session.setAttribute("TC4", "TinhCach");
                } else if (result.variableName.equals("g5")) {
                    url = "DaiHoc/TinhCach5.jsp";
                    session.setAttribute("TC5", "TinhCach");
                } else if (result.variableName.equals("g6")) {
                    url = "DaiHoc/TinhCach6.jsp";
                    session.setAttribute("TC6", "TinhCach");
                }
            } else {
                request.setAttribute("Cao đẳng", "KQCTDT");
                if (result.variableName.equals("g1")) {
                    url = "CaoDang/TinhCach1.jsp";
                    session.setAttribute("TC1", "TinhCach");
                } else if (result.variableName.equals("g2")) {
                    url = "CaoDang/TinhCach2.jsp";
                    session.setAttribute("TC2", "TinhCach");
                } else if (result.variableName.equals("g3")) {
                    url = "CaoDang/TinhCach3.jsp";
                    session.setAttribute("TC3", "TinhCach");
                } else if (result.variableName.equals("g4")) {
                    url = "CaoDang/TinhCach4.jsp";
                    session.setAttribute("TC4", "TinhCach");
                } else if (result.variableName.equals("g5")) {
                    url = "CaoDang/TinhCach5.jsp";
                    session.setAttribute("TC5", "TinhCach");
                } else if (result.variableName.equals("g6")) {
                    url = "CaoDang/TinhCach6.jsp";
                    session.setAttribute("TC6", "TinhCach");
                }
            }
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
//        }

    }

    class Result {

        double maxValue;
        String variableName;

        Result(double maxValue, String variableName) {
            this.maxValue = maxValue;
            this.variableName = variableName;
        }
    }

    public Result findMaxWithVariable(double... values) {
        double max = Double.MIN_VALUE; // Giả sử giá trị nhỏ nhất là Double.MIN_VALUE
        String variableName = "";

        // Duyệt qua mảng giá trị và cập nhật giá trị lớn nhất và biến tương ứng
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
                variableName = "g" + (i + 1);
            }
        }

        return new Result(max, variableName);
    }

}
