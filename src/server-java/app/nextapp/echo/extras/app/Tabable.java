package nextapp.echo.extras.app;

import nextapp.echo.app.Alignment;
import nextapp.echo.app.Border;
import nextapp.echo.app.Color;
import nextapp.echo.app.Extent;
import nextapp.echo.app.FillImage;
import nextapp.echo.app.FillImageBorder;
import nextapp.echo.app.Font;
import nextapp.echo.app.ImageReference;
import nextapp.echo.app.Insets;
import nextapp.echo.extras.app.event.TabClosingListener;
import nextapp.echo.extras.app.event.TabSelectionListener;

/**
 *
 * @author sieskei
 */
public interface Tabable
{
  public void addTabClosingListener(TabClosingListener tl);
  public void addTabSelectionListener(TabSelectionListener tl);  
  public void fireTabClosing(int i);
  public void fireTabSelected(int i);  
  public int getActiveTabIndex();  
  public Color getTabActiveBackground();
  public FillImage getTabActiveBackgroundImage();
  public Insets getTabActiveBackgroundInsets();
  public Border getTabActiveBorder();
  public Font getTabActiveFont();
  public Color getTabActiveForeground();
  public Extent getTabActiveHeightIncrease();
  public Insets getTabActiveInsets();
  public FillImageBorder getTabActiveImageBorder();
  public ImageReference getTabActiveLeftImage();
  public ImageReference getTabActiveRightImage();
  public Alignment getTabAlignment();
  public FillImage getTabBackgroundImage();
  public ImageReference getTabCloseIcon();
  public int getTabDefaultCloseOperation();
  public ImageReference getTabDisabledCloseIcon();
  public Extent getTabHeight();
  public Extent getTabIconTextMargin();
  public Color getTabInactiveBackground();
  public FillImage getTabInactiveBackgroundImage();
  public Insets getTabInactiveBackgroundInsets();
  public Border getTabInactiveBorder();
  public Font getTabInactiveFont();
  public Color getTabInactiveForeground();
  public FillImageBorder getTabInactiveImageBorder();
  public Insets getTabInactiveInsets();
  public ImageReference getTabInactiveLeftImage();
  public ImageReference getTabInactiveRightImage();
  public Extent getTabInset();
  public Extent getTabMaximumWidth();
  public int getTabPosition();
  public Color getTabRolloverBackground();
  public FillImage getTabRolloverBackgroundImage();
  public Insets getTabRolloverBackgroundInsets();
  public Border getTabRolloverBorder();
  public ImageReference getTabRolloverCloseIcon();
  public Font getTabRolloverFont();
  public Color getTabRolloverForeground();
  public FillImageBorder getTabRolloverImageBorder();
  public Extent getTabSpacing();
  public Extent getTabWidth();
  public boolean hasTabClosingListeners();
  public boolean hasTabSelectionListeners();
  public boolean isTabCloseEnabled();
  public boolean isTabCloseIconRolloverEnabled();
  public boolean isTabRolloverEnabled();
  public void removeTabClosingListener(TabClosingListener tl);
  public void removeTabSelectionListener(TabSelectionListener tl);
  public void setActiveTabIndex(int i);
  public void setTabActiveBackground(Color color);
  public void setTabActiveBackgroundImage(FillImage fi);
  public void setTabActiveBackgroundInsets(Insets insets);
  public void setTabActiveBorder(Border border);
  public void setTabActiveFont(Font font);
  public void setTabActiveForeground(Color color);
  public void setTabActiveHeightIncrease(Extent extent);
  public void setTabActiveImageBorder(FillImageBorder fib);
  public void setTabActiveInsets(Insets insets);
  public void setTabActiveLeftImage(ImageReference ir);
  public void setTabActiveRightImage(ImageReference ir);
  public void setTabAlignment(Alignment a);
  public void setTabBackgroundImage(FillImage fi);
  public void setTabCloseEnabled(boolean bln);
  public void setTabCloseIcon(ImageReference ir);
  public void setTabCloseIconRolloverEnabled(boolean bln);
  public void setTabDefaultCloseOperation(int i);
  public void setTabDisabledCloseIcon(ImageReference ir);
  public void setTabHeight(Extent extent);
  public void setTabIconTextMargin(Extent extent);
  public void setTabInactiveBackground(Color color);
  public void setTabInactiveBackgroundImage(FillImage fi);
  public void setTabInactiveBackgroundInsets(Insets insets);
  public void setTabInactiveBorder(Border border);
  public void setTabInactiveFont(Font font);
  public void setTabInactiveForeground(Color color);
  public void setTabInactiveImageBorder(FillImageBorder fib);
  public void setTabInactiveInsets(Insets insets);
  public void setTabInactiveLeftImage(ImageReference ir);
  public void setTabInactiveRightImage(ImageReference ir);
  public void setTabInset(Extent extent);
  public void setTabMaximumWidth(Extent extent);
  public void setTabPosition(int i);
  public void setTabRolloverBackground(Color color);
  public void setTabRolloverBackgroundImage(FillImage fi);
  public void setTabRolloverBackgroundInsets(Insets insets);
  public void setTabRolloverBorder(Border border);
  public void setTabRolloverCloseIcon(ImageReference ir);
  public void setTabRolloverEnabled(boolean bln);
  public void setTabRolloverFont(Font font);
  public void setTabRolloverForeground(Color color);
  public void setTabRolloverImageBorder(FillImageBorder fib);
  public void setTabSpacing(Extent extent);
  public void setTabWidth(Extent extent);
  public void userTabClose(int i);
  public void userTabSelect(int i);
}
